package defpackage;
public abstract class fad {
    public static final lo5 a = new lo5("COMPLETING_ALREADY");
    public static final lo5 b = new lo5("COMPLETING_WAITING_CHILDREN");
    public static final lo5 c = new lo5("COMPLETING_RETRY");
    public static final lo5 d = new lo5("TOO_LATE_TO_CANCEL");
    public static final lo5 e = new lo5("SEALED");
    public static final v14 f = new v14(false);
    public static final v14 g = new v14(true);

    public static final Object a(Object obj) {
        fn5 fn5Var;
        if (obj instanceof fn5) {
            fn5Var = (fn5) obj;
        } else {
            fn5Var = null;
        }
        if (fn5Var != null) {
            return fn5Var.a;
        }
        return obj;
    }
}
