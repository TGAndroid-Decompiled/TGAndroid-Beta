package kotlin.jvm.internal;

import a8.p0;
public abstract class u {
    public static void a(int i7, Object obj) {
        int i10;
        if (obj != null) {
            if (obj instanceof gd.a) {
                if (obj instanceof g) {
                    i10 = ((g) obj).getArity();
                } else if (obj instanceof rd.a) {
                    i10 = 0;
                } else if (obj instanceof rd.l) {
                    i10 = 1;
                } else if (obj instanceof rd.p) {
                    i10 = 2;
                } else if (obj instanceof rd.q) {
                    i10 = 3;
                } else {
                    i10 = -1;
                }
                if (i10 == i7) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(p0.D(obj.getClass().getName(), " cannot be cast to ", jg.g.j(i7, "kotlin.jvm.functions.Function")));
            j.g(classCastException, u.class.getName());
            throw classCastException;
        }
    }
}
