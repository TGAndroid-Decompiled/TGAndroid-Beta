package ab;
public final class h implements ja.d {
    public static final h f402a = new Object();
    public static final ja.c f403b = ja.c.c("sessionId");
    public static final ja.c f404c = ja.c.c("firstSessionId");
    public static final ja.c d = ja.c.c("sessionIndex");
    public static final ja.c e = ja.c.c("eventTimestampUs");
    public static final ja.c f405f = ja.c.c("dataCollectionStatus");
    public static final ja.c f406g = ja.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f403b, n0Var.f444a);
        eVar.d(f404c, n0Var.f445b);
        eVar.g(d, n0Var.f446c);
        eVar.f(e, n0Var.d);
        eVar.d(f405f, n0Var.e);
        eVar.d(f406g, n0Var.f447f);
    }
}
