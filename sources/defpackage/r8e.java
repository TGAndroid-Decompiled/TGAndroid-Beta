package defpackage;

import j$.util.Objects;
import java.util.Comparator;
public abstract class r8e {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(r8e.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = m8e.a;
        }
        a = comparator;
    }
}
