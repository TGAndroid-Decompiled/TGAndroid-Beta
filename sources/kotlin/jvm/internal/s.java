package kotlin.jvm.internal;
public abstract class s {
    public static void a(int i10, Object obj) {
        int i11;
        if (obj != null) {
            if (obj instanceof ad.a) {
                if (obj instanceof f) {
                    i11 = ((f) obj).getArity();
                } else if (obj instanceof ld.a) {
                    i11 = 0;
                } else if (obj instanceof ld.l) {
                    i11 = 1;
                } else if (obj instanceof ld.p) {
                    i11 = 2;
                } else if (obj instanceof ld.q) {
                    i11 = 3;
                } else {
                    i11 = -1;
                }
                if (i11 == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a1.g.C(obj.getClass().getName(), " cannot be cast to ", i0.a.i(i10, "kotlin.jvm.functions.Function")));
            i.f(classCastException, s.class.getName());
            throw classCastException;
        }
    }
}
