package bb;
public final class h implements ka.d {
    public static final h f3760a = new Object();
    public static final ka.c f3761b = ka.c.c("sessionId");
    public static final ka.c f3762c = ka.c.c("firstSessionId");
    public static final ka.c d = ka.c.c("sessionIndex");
    public static final ka.c e = ka.c.c("eventTimestampUs");
    public static final ka.c f3763f = ka.c.c("dataCollectionStatus");
    public static final ka.c f3764g = ka.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f3761b, n0Var.f3802a);
        eVar.a(f3762c, n0Var.f3803b);
        eVar.e(d, n0Var.f3804c);
        eVar.f(e, n0Var.d);
        eVar.a(f3763f, n0Var.e);
        eVar.a(f3764g, n0Var.f3805f);
    }
}
