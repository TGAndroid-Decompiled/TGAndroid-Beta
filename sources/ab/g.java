package ab;
public final class g implements ja.d {
    public static final g f401a = new Object();
    public static final ja.c f402b = ja.c.c("eventType");
    public static final ja.c f403c = ja.c.c("sessionData");
    public static final ja.c d = ja.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        ja.e eVar = (ja.e) obj2;
        e0Var.getClass();
        eVar.d(f402b, k.SESSION_START);
        eVar.d(f403c, e0Var.f394a);
        eVar.d(d, e0Var.f395b);
    }
}
