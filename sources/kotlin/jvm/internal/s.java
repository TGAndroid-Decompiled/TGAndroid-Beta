package kotlin.jvm.internal;

import j3.r0;
public abstract class s {
    public static void a(int i9, Object obj) {
        int i10;
        if (obj != null) {
            if (obj instanceof oc.a) {
                if (obj instanceof f) {
                    i10 = ((f) obj).getArity();
                } else if (obj instanceof zc.a) {
                    i10 = 0;
                } else if (obj instanceof zc.l) {
                    i10 = 1;
                } else if (obj instanceof zc.p) {
                    i10 = 2;
                } else if (obj instanceof zc.q) {
                    i10 = 3;
                } else {
                    i10 = -1;
                }
                if (i10 == i9) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(aa.d.z(obj.getClass().getName(), " cannot be cast to ", r0.l(i9, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
