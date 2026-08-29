package ja;
public final class g implements s9.d {
    public static final g f11335a = new Object();
    public static final s9.c f11336b = s9.c.c("eventType");
    public static final s9.c f11337c = s9.c.c("sessionData");
    public static final s9.c d = s9.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        s9.e eVar = (s9.e) obj2;
        e0Var.getClass();
        eVar.e(f11336b, k.SESSION_START);
        eVar.e(f11337c, e0Var.f11327a);
        eVar.e(d, e0Var.f11328b);
    }
}
