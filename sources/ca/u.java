package ca;
public final class u implements ma.d {
    public static final u f4549a = new Object();
    public static final ma.c f4550b = ma.c.c("batteryLevel");
    public static final ma.c f4551c = ma.c.c("batteryVelocity");
    public static final ma.c d = ma.c.c("proximityOn");
    public static final ma.c f4552e = ma.c.c("orientation");
    public static final ma.c f4553f = ma.c.c("ramUsed");
    public static final ma.c f4554g = ma.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        g1 g1Var = (g1) ((l2) obj);
        eVar.a(f4550b, g1Var.f4387a);
        eVar.e(f4551c, g1Var.f4388b);
        eVar.b(d, g1Var.f4389c);
        eVar.e(f4552e, g1Var.d);
        eVar.f(f4553f, g1Var.f4390e);
        eVar.f(f4554g, g1Var.f4391f);
    }
}
