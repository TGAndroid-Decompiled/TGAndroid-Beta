package kotlin.jvm.internal;

import a4.w;
import j7.l1;
public abstract class t {
    public static void a(int i10, Object obj) {
        int i11;
        if (obj != null) {
            if (obj instanceof qc.a) {
                if (obj instanceof g) {
                    i11 = ((g) obj).getArity();
                } else if (obj instanceof bd.a) {
                    i11 = 0;
                } else if (obj instanceof bd.l) {
                    i11 = 1;
                } else if (obj instanceof bd.p) {
                    i11 = 2;
                } else if (obj instanceof bd.q) {
                    i11 = 3;
                } else {
                    i11 = -1;
                }
                if (i11 == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(w.y(obj.getClass().getName(), " cannot be cast to ", l1.k(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
