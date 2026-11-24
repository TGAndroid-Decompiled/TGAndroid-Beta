package defpackage;
public abstract class hcd {
    public static final du2 a = new du2("COMPLETING_ALREADY", (byte) 2);
    public static final du2 b = new du2("COMPLETING_WAITING_CHILDREN", (byte) 2);
    public static final du2 c = new du2("COMPLETING_RETRY", (byte) 2);
    public static final du2 d = new du2("TOO_LATE_TO_CANCEL", (byte) 2);
    public static final du2 e = new du2("SEALED", (byte) 2);
    public static final g34 f = new g34(false);
    public static final g34 g = new g34(true);

    public static final Object a(Object obj) {
        fp5 fp5Var;
        if (obj instanceof fp5) {
            fp5Var = (fp5) obj;
        } else {
            fp5Var = null;
        }
        if (fp5Var != null) {
            return fp5Var.a;
        }
        return obj;
    }
}
