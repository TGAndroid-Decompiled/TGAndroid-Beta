package defpackage;

import j$.util.Objects;
import java.util.Comparator;
public abstract class sae {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(sae.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = nae.a;
        }
        a = comparator;
    }
}
