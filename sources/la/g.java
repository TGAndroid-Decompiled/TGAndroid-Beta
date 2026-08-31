package la;
public final class g implements u9.d {
    public static final g f12180a = new Object();
    public static final u9.c f12181b = u9.c.c("eventType");
    public static final u9.c f12182c = u9.c.c("sessionData");
    public static final u9.c d = u9.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        u9.e eVar = (u9.e) obj2;
        b0Var.getClass();
        eVar.e(f12181b, k.SESSION_START);
        eVar.e(f12182c, b0Var.f12146a);
        eVar.e(d, b0Var.f12147b);
    }
}
