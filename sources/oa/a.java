package oa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    boolean nullSafe() default true;

    Class value();
}
