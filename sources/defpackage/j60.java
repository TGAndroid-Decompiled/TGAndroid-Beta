package defpackage;
public final class j60 implements zn7 {
    public static final j60 a = new Object();
    public static final w84 b = w84.c("batteryLevel");
    public static final w84 c = w84.c("batteryVelocity");
    public static final w84 d = w84.c("proximityOn");
    public static final w84 e = w84.c("orientation");
    public static final w84 f = w84.c("ramUsed");
    public static final w84 g = w84.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        yy2 yy2Var = (yy2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, ((d90) yy2Var).a);
        d90 d90Var = (d90) yy2Var;
        ao7Var.e(c, d90Var.b);
        ao7Var.d(d, d90Var.c);
        ao7Var.e(e, d90Var.d);
        ao7Var.g(f, d90Var.e);
        ao7Var.g(g, d90Var.f);
    }
}
