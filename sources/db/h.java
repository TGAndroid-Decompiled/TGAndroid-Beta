package db;
public final class h implements ma.d {
    public static final h f8662a = new Object();
    public static final ma.c f8663b = ma.c.c("sessionId");
    public static final ma.c f8664c = ma.c.c("firstSessionId");
    public static final ma.c d = ma.c.c("sessionIndex");
    public static final ma.c f8665e = ma.c.c("eventTimestampUs");
    public static final ma.c f8666f = ma.c.c("dataCollectionStatus");
    public static final ma.c f8667g = ma.c.c("firebaseInstallationId");
    public static final ma.c h = ma.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f8663b, w0Var.f8746a);
        eVar.a(f8664c, w0Var.f8747b);
        eVar.e(d, w0Var.f8748c);
        eVar.f(f8665e, w0Var.d);
        eVar.a(f8666f, w0Var.f8749e);
        eVar.a(f8667g, w0Var.f8750f);
        eVar.a(h, w0Var.f8751g);
    }
}
