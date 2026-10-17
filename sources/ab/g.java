package ab;
public final class g implements ja.d {
    public static final g f400a = new Object();
    public static final ja.c f401b = ja.c.c("eventType");
    public static final ja.c f402c = ja.c.c("sessionData");
    public static final ja.c d = ja.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        ja.e eVar = (ja.e) obj2;
        e0Var.getClass();
        eVar.d(f401b, k.SESSION_START);
        eVar.d(f402c, e0Var.f393a);
        eVar.d(d, e0Var.f394b);
    }
}
