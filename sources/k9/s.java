package k9;
public final class s implements u9.d {
    public static final s f10234a = new Object();
    public static final u9.c f10235b = u9.c.c("batteryLevel");
    public static final u9.c f10236c = u9.c.c("batteryVelocity");
    public static final u9.c d = u9.c.c("proximityOn");
    public static final u9.c e = u9.c.c("orientation");
    public static final u9.c f10237f = u9.c.c("ramUsed");
    public static final u9.c f10238g = u9.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.e(f10235b, u0Var.f10252a);
        eVar.a(f10236c, u0Var.f10253b);
        eVar.d(d, u0Var.f10254c);
        eVar.a(e, u0Var.d);
        eVar.b(f10237f, u0Var.e);
        eVar.b(f10238g, u0Var.f10255f);
    }
}
