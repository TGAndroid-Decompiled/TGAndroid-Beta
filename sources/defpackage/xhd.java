package defpackage;
public abstract class xhd {
    public static final ow5 a = new ow5("NO_THREAD_ELEMENTS", (byte) 1);
    public static final xm2 b = new xm2((byte) 6);
    public static final xm2 c = new xm2((byte) 7);
    public static final xm2 d = new xm2((byte) 8);

    public static final void a(mx2 mx2Var, Object obj) {
        if (obj != a) {
            if (obj instanceof erb) {
                ix2[] ix2VarArr = ((erb) obj).b;
                int length = ix2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                ix2 ix2Var = ix2VarArr[length];
                throw null;
            }
            mx2Var.fold(null, c).getClass();
            grb.o();
        }
    }

    public static final Object b(mx2 mx2Var) {
        Object fold = mx2Var.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(mx2 mx2Var, Object obj) {
        if (obj == null) {
            obj = b(mx2Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return mx2Var.fold(new erb(((Number) obj).intValue(), mx2Var), d);
        }
        grb.o();
        return null;
    }
}
