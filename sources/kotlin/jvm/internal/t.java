package kotlin.jvm.internal;

public abstract class t {
    public static void a(int i10, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof pc.a) {
                if (obj instanceof g) {
                    arity = ((g) obj).getArity();
                } else if (obj instanceof ad.a) {
                    arity = 0;
                } else if (obj instanceof ad.l) {
                    arity = 1;
                } else if (obj instanceof ad.p) {
                    arity = 2;
                } else {
                    arity = obj instanceof ad.q ? 3 : -1;
                }
                if (arity == i10) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(a9.p.w(obj.getClass().getName(), " cannot be cast to ", i0.a.k(i10, "kotlin.jvm.functions.Function")));
            j.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }
}
