package h9;

public final class s implements r9.d {

    public static final s f8809a = new s();

    public static final r9.c f8810b = r9.c.c("batteryLevel");

    public static final r9.c f8811c = r9.c.c("batteryVelocity");
    public static final r9.c d = r9.c.c("proximityOn");

    public static final r9.c f8812e = r9.c.c("orientation");

    public static final r9.c f8813f = r9.c.c("ramUsed");

    public static final r9.c f8814g = r9.c.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(f8810b, u0Var.f8830a);
        eVar.d(f8811c, u0Var.f8831b);
        eVar.g(d, u0Var.f8832c);
        eVar.d(f8812e, u0Var.d);
        eVar.c(f8813f, u0Var.f8833e);
        eVar.c(f8814g, u0Var.f8834f);
    }
}
