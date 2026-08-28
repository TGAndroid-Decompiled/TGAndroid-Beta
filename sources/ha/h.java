package ha;
public final class h implements q9.d {
    public static final h f10303a = new Object();
    public static final q9.c f10304b = q9.c.c("sessionId");
    public static final q9.c f10305c = q9.c.c("firstSessionId");
    public static final q9.c d = q9.c.c("sessionIndex");
    public static final q9.c f10306e = q9.c.c("eventTimestampUs");
    public static final q9.c f10307f = q9.c.c("dataCollectionStatus");
    public static final q9.c f10308g = q9.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(f10304b, n0Var.f10350a);
        eVar.g(f10305c, n0Var.f10351b);
        eVar.c(d, n0Var.f10352c);
        eVar.d(f10306e, n0Var.d);
        eVar.g(f10307f, n0Var.f10353e);
        eVar.g(f10308g, n0Var.f10354f);
    }
}
