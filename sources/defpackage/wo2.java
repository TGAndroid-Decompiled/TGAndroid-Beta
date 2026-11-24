package defpackage;

import java.util.Comparator;
public abstract class wo2 {
    public static final uo2 a = new Object();
    public static final vo2 b = new vo2(-1);
    public static final vo2 c = new vo2(1);

    public wo2 a(int i, int i2) {
        return uo2.f(Integer.compare(i, i2));
    }

    public wo2 b(Object obj, Object obj2, Comparator comparator) {
        return uo2.f(comparator.compare(obj, obj2));
    }

    public wo2 c(boolean z, boolean z2) {
        return uo2.f(Boolean.compare(z, z2));
    }

    public wo2 d(boolean z, boolean z2) {
        return uo2.f(Boolean.compare(z2, z));
    }

    public int e() {
        return 0;
    }
}
