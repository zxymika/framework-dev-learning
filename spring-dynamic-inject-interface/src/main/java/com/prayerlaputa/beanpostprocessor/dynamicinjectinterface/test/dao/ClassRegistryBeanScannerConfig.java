package com.prayerlaputa.beanpostprocessor.dynamicinjectinterface.test.dao;

import com.prayerlaputa.beanpostprocessor.dynamicinjectinterface.DefaultClassRegistryBeanFactory;
import com.prayerlaputa.beanpostprocessor.dynamicinjectinterface.MapperManagerFactoryBean;
import com.prayerlaputa.beanpostprocessor.dynamicinjectinterface.test.TestMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenglong.yu
 * created on 2021/1/18
 */
@Configuration
public class ClassRegistryBeanScannerConfig {
    @Bean(name = "mapperManagerFactoryBean")
    public MapperManagerFactoryBean configMapperManagerFactoryBean() {
        MapperManagerFactoryBean mapperManagerFactoryBean = new MapperManagerFactoryBean();
        return mapperManagerFactoryBean;
    }

    @Bean
    public DefaultClassRegistryBeanFactory configDefaultClassRegistryBeanFactory() {
        DefaultClassRegistryBeanFactory defaultClassRegistryBeanFactory = new DefaultClassRegistryBeanFactory();
        defaultClassRegistryBeanFactory.setScanPackage(TestMapper.MAPPER_PACKAGE_INFO);
        defaultClassRegistryBeanFactory.setMapperManagerFactoryBean("mapperManagerFactoryBean");
        return defaultClassRegistryBeanFactory;
    }
}
