package la;
public final class g implements u9.d {
    public static final g f11878a = new Object();
    public static final u9.c f11879b = u9.c.c("eventType");
    public static final u9.c f11880c = u9.c.c("sessionData");
    public static final u9.c d = u9.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        u9.e eVar = (u9.e) obj2;
        b0Var.getClass();
        eVar.e(f11879b, k.SESSION_START);
        eVar.e(f11880c, b0Var.f11848a);
        eVar.e(d, b0Var.f11849b);
    }
}
