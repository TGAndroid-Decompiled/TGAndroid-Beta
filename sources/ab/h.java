package ab;
public final class h implements ja.d {
    public static final h f403a = new Object();
    public static final ja.c f404b = ja.c.c("sessionId");
    public static final ja.c f405c = ja.c.c("firstSessionId");
    public static final ja.c d = ja.c.c("sessionIndex");
    public static final ja.c e = ja.c.c("eventTimestampUs");
    public static final ja.c f406f = ja.c.c("dataCollectionStatus");
    public static final ja.c f407g = ja.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f404b, n0Var.f445a);
        eVar.d(f405c, n0Var.f446b);
        eVar.g(d, n0Var.f447c);
        eVar.f(e, n0Var.d);
        eVar.d(f406f, n0Var.e);
        eVar.d(f407g, n0Var.f448f);
    }
}
