package ha;
public final class g implements q9.d {
    public static final g f10300a = new Object();
    public static final q9.c f10301b = q9.c.c("eventType");
    public static final q9.c f10302c = q9.c.c("sessionData");
    public static final q9.c d = q9.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        q9.e eVar = (q9.e) obj2;
        e0Var.getClass();
        eVar.g(f10301b, k.SESSION_START);
        eVar.g(f10302c, e0Var.f10292a);
        eVar.g(d, e0Var.f10293b);
    }
}
