package ia;

public final class g implements r9.d {

    public static final g f11009a = new g();

    public static final r9.c f11010b = r9.c.c("eventType");

    public static final r9.c f11011c = r9.c.c("sessionData");
    public static final r9.c d = r9.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        r9.e eVar = (r9.e) obj2;
        f0Var.getClass();
        eVar.a(f11010b, k.SESSION_START);
        eVar.a(f11011c, f0Var.f11007a);
        eVar.a(d, f0Var.f11008b);
    }
}
