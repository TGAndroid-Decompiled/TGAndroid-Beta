package n7;

import j$.util.Objects;
import java.util.Comparator;
public abstract class p0 {
    public static final Comparator f16673a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(p0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = o0.f16670a;
        }
        f16673a = comparator;
    }
}
