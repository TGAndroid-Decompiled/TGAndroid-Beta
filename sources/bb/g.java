package bb;
public final class g implements ka.d {
    public static final g f3757a = new Object();
    public static final ka.c f3758b = ka.c.c("eventType");
    public static final ka.c f3759c = ka.c.c("sessionData");
    public static final ka.c d = ka.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        ka.e eVar = (ka.e) obj2;
        e0Var.getClass();
        eVar.a(f3758b, k.SESSION_START);
        eVar.a(f3759c, e0Var.f3750a);
        eVar.a(d, e0Var.f3751b);
    }
}
