package k9;
public final class s implements u9.d {
    public static final s f10214a = new Object();
    public static final u9.c f10215b = u9.c.c("batteryLevel");
    public static final u9.c f10216c = u9.c.c("batteryVelocity");
    public static final u9.c d = u9.c.c("proximityOn");
    public static final u9.c e = u9.c.c("orientation");
    public static final u9.c f10217f = u9.c.c("ramUsed");
    public static final u9.c f10218g = u9.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.e(f10215b, u0Var.f10232a);
        eVar.a(f10216c, u0Var.f10233b);
        eVar.d(d, u0Var.f10234c);
        eVar.a(e, u0Var.d);
        eVar.b(f10217f, u0Var.e);
        eVar.b(f10218g, u0Var.f10235f);
    }
}
