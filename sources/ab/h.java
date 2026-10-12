package ab;
public final class h implements ja.d {
    public static final h f400a = new Object();
    public static final ja.c f401b = ja.c.c("sessionId");
    public static final ja.c f402c = ja.c.c("firstSessionId");
    public static final ja.c d = ja.c.c("sessionIndex");
    public static final ja.c e = ja.c.c("eventTimestampUs");
    public static final ja.c f403f = ja.c.c("dataCollectionStatus");
    public static final ja.c f404g = ja.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f401b, n0Var.f442a);
        eVar.d(f402c, n0Var.f443b);
        eVar.g(d, n0Var.f444c);
        eVar.f(e, n0Var.d);
        eVar.d(f403f, n0Var.e);
        eVar.d(f404g, n0Var.f445f);
    }
}
