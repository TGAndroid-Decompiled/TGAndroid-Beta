package kotlin.jvm.internal;

import kh.a2;
public abstract class t {
    public static void a(int i10, Object obj) {
        int i11;
        if (obj != null) {
            if (obj instanceof sc.a) {
                if (obj instanceof g) {
                    i11 = ((g) obj).getArity();
                } else if (obj instanceof dd.a) {
                    i11 = 0;
                } else if (obj instanceof dd.l) {
                    i11 = 1;
                } else if (obj instanceof dd.p) {
                    i11 = 2;
                } else if (obj instanceof dd.q) {
                    i11 = 3;
                } else {
                    i11 = -1;
                }
                if (i11 == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(android.support.v4.media.a.z(obj.getClass().getName(), " cannot be cast to ", a2.j(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
