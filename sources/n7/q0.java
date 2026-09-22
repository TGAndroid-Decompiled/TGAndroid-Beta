package n7;

import j$.util.Objects;
import java.util.Comparator;
public abstract class q0 {
    public static final Comparator f15160a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(q0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = p0.f15157a;
        }
        f15160a = comparator;
    }
}
