package b7;

import j$.util.Objects;
import java.util.Comparator;
public abstract class t0 {
    public static final Comparator f1873a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(t0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = s0.f1871a;
        }
        f1873a = comparator;
    }
}
