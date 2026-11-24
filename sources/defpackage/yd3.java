package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface yd3 {
    int objectTypeIndication() default -1;

    int[] tags();
}
