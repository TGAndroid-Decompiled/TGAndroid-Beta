package defpackage;
public final class n50 implements zn7 {
    public static final n50 a = new Object();
    public static final w84 b = w84.c("requestTimeMs");
    public static final w84 c = w84.c("requestUptimeMs");
    public static final w84 d = w84.c("clientInfo");
    public static final w84 e = w84.c("logSource");
    public static final w84 f = w84.c("logSourceName");
    public static final w84 g = w84.c("logEvent");
    public static final w84 h = w84.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        zb6 zb6Var = (zb6) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.g(b, ((ba0) zb6Var).a);
        ba0 ba0Var = (ba0) zb6Var;
        ao7Var.g(c, ba0Var.b);
        ao7Var.a(d, ba0Var.c);
        ao7Var.a(e, ba0Var.d);
        ao7Var.a(f, ba0Var.e);
        ao7Var.a(g, ba0Var.f);
        ao7Var.a(h, ev8.a);
    }
}
