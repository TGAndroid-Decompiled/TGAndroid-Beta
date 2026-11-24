package defpackage;
public final class n60 implements cq7 {
    public static final n60 a = new Object();
    public static final wa4 b = wa4.c("requestTimeMs");
    public static final wa4 c = wa4.c("requestUptimeMs");
    public static final wa4 d = wa4.c("clientInfo");
    public static final wa4 e = wa4.c("logSource");
    public static final wa4 f = wa4.c("logSourceName");
    public static final wa4 g = wa4.c("logEvent");
    public static final wa4 h = wa4.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        yd6 yd6Var = (yd6) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, ((bb0) yd6Var).a);
        bb0 bb0Var = (bb0) yd6Var;
        dq7Var.g(c, bb0Var.b);
        dq7Var.a(d, bb0Var.c);
        dq7Var.a(e, bb0Var.d);
        dq7Var.a(f, bb0Var.e);
        dq7Var.a(g, bb0Var.f);
        dq7Var.a(h, fx8.a);
    }
}
