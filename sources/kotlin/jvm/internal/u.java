package kotlin.jvm.internal;

import k2.p1;
public abstract class u {
    public static void a(int i3, Object obj) {
        int i10;
        if (obj != null) {
            if (obj instanceof dd.a) {
                if (obj instanceof g) {
                    i10 = ((g) obj).getArity();
                } else if (obj instanceof od.a) {
                    i10 = 0;
                } else if (obj instanceof od.l) {
                    i10 = 1;
                } else if (obj instanceof od.p) {
                    i10 = 2;
                } else if (obj instanceof od.q) {
                    i10 = 3;
                } else {
                    i10 = -1;
                }
                if (i10 == i3) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a1.g.C(obj.getClass().getName(), " cannot be cast to ", p1.i(i3, "kotlin.jvm.functions.Function")));
            j.g(classCastException, u.class.getName());
            throw classCastException;
        }
    }
}
