package k9;
public final class s implements u9.d {
    public static final s f10993a = new Object();
    public static final u9.c f10994b = u9.c.c("batteryLevel");
    public static final u9.c f10995c = u9.c.c("batteryVelocity");
    public static final u9.c d = u9.c.c("proximityOn");
    public static final u9.c f10996e = u9.c.c("orientation");
    public static final u9.c f10997f = u9.c.c("ramUsed");
    public static final u9.c f10998g = u9.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.e(f10994b, u0Var.f11014a);
        eVar.a(f10995c, u0Var.f11015b);
        eVar.d(d, u0Var.f11016c);
        eVar.a(f10996e, u0Var.d);
        eVar.b(f10997f, u0Var.f11017e);
        eVar.b(f10998g, u0Var.f11018f);
    }
}
