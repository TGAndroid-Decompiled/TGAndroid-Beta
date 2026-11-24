package defpackage;
public abstract class gfd {
    public static final du2 a = new du2("NO_THREAD_ELEMENTS", (byte) 2);
    public static final qn2 b = new qn2((byte) 6);
    public static final qn2 c = new qn2((byte) 7);
    public static final qn2 d = new qn2((byte) 8);

    public static final void a(cy2 cy2Var, Object obj) {
        if (obj != a) {
            if (obj instanceof gpb) {
                yx2[] yx2VarArr = ((gpb) obj).b;
                int length = yx2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                yx2 yx2Var = yx2VarArr[length];
                throw null;
            }
            cy2Var.fold(null, c).getClass();
            rjb.p();
        }
    }

    public static final Object b(cy2 cy2Var) {
        Object fold = cy2Var.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(cy2 cy2Var, Object obj) {
        if (obj == null) {
            obj = b(cy2Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return cy2Var.fold(new gpb(((Number) obj).intValue(), cy2Var), d);
        }
        rjb.p();
        return null;
    }
}
