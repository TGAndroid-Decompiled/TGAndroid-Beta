package defpackage;
public abstract class yed {
    public static final ow5 a = new ow5("COMPLETING_ALREADY", (byte) 1);
    public static final ow5 b = new ow5("COMPLETING_WAITING_CHILDREN", (byte) 1);
    public static final ow5 c = new ow5("COMPLETING_RETRY", (byte) 1);
    public static final ow5 d = new ow5("TOO_LATE_TO_CANCEL", (byte) 1);
    public static final ow5 e = new ow5("SEALED", (byte) 1);
    public static final q24 f = new q24(false);
    public static final q24 g = new q24(true);

    public static final Object a(Object obj) {
        ip5 ip5Var;
        if (obj instanceof ip5) {
            ip5Var = (ip5) obj;
        } else {
            ip5Var = null;
        }
        if (ip5Var != null) {
            return ip5Var.a;
        }
        return obj;
    }
}
