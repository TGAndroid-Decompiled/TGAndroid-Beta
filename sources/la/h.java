package la;
public final class h implements u9.d {
    public static final h f11774a = new Object();
    public static final u9.c f11775b = u9.c.c("sessionId");
    public static final u9.c f11776c = u9.c.c("firstSessionId");
    public static final u9.c d = u9.c.c("sessionIndex");
    public static final u9.c e = u9.c.c("eventTimestampUs");
    public static final u9.c f11777f = u9.c.c("dataCollectionStatus");
    public static final u9.c f11778g = u9.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11775b, k0Var.f11797a);
        eVar.e(f11776c, k0Var.f11798b);
        eVar.a(d, k0Var.f11799c);
        eVar.b(e, k0Var.d);
        eVar.e(f11777f, k0Var.e);
        eVar.e(f11778g, k0Var.f11800f);
    }
}
