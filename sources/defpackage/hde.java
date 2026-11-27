package defpackage;

import j$.util.Objects;
import java.util.Comparator;
public abstract class hde {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(hde.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = cde.a;
        }
        a = comparator;
    }
}
