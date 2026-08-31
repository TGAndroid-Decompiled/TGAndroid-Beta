package la;
public final class h implements u9.d {
    public static final h f12186a = new Object();
    public static final u9.c f12187b = u9.c.c("sessionId");
    public static final u9.c f12188c = u9.c.c("firstSessionId");
    public static final u9.c d = u9.c.c("sessionIndex");
    public static final u9.c f12189e = u9.c.c("eventTimestampUs");
    public static final u9.c f12190f = u9.c.c("dataCollectionStatus");
    public static final u9.c f12191g = u9.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f12187b, k0Var.f12213a);
        eVar.e(f12188c, k0Var.f12214b);
        eVar.a(d, k0Var.f12215c);
        eVar.b(f12189e, k0Var.d);
        eVar.e(f12190f, k0Var.f12216e);
        eVar.e(f12191g, k0Var.f12217f);
    }
}
