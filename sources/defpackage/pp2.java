package defpackage;

import java.util.Comparator;
public abstract class pp2 {
    public static final np2 a = new Object();
    public static final op2 b = new op2(-1);
    public static final op2 c = new op2(1);

    public pp2 a(int i, int i2) {
        return np2.f(Integer.compare(i, i2));
    }

    public pp2 b(Object obj, Object obj2, Comparator comparator) {
        return np2.f(comparator.compare(obj, obj2));
    }

    public pp2 c(boolean z, boolean z2) {
        return np2.f(Boolean.compare(z, z2));
    }

    public pp2 d(boolean z, boolean z2) {
        return np2.f(Boolean.compare(z2, z));
    }

    public int e() {
        return 0;
    }
}
