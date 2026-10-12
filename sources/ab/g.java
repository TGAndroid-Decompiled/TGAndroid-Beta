package ab;
public final class g implements ja.d {
    public static final g f397a = new Object();
    public static final ja.c f398b = ja.c.c("eventType");
    public static final ja.c f399c = ja.c.c("sessionData");
    public static final ja.c d = ja.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        ja.e eVar = (ja.e) obj2;
        e0Var.getClass();
        eVar.d(f398b, k.SESSION_START);
        eVar.d(f399c, e0Var.f390a);
        eVar.d(d, e0Var.f391b);
    }
}
