package la;
public final class h implements u9.d {
    public static final h f11884a = new Object();
    public static final u9.c f11885b = u9.c.c("sessionId");
    public static final u9.c f11886c = u9.c.c("firstSessionId");
    public static final u9.c d = u9.c.c("sessionIndex");
    public static final u9.c e = u9.c.c("eventTimestampUs");
    public static final u9.c f11887f = u9.c.c("dataCollectionStatus");
    public static final u9.c f11888g = u9.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11885b, k0Var.f11907a);
        eVar.e(f11886c, k0Var.f11908b);
        eVar.a(d, k0Var.f11909c);
        eVar.b(e, k0Var.d);
        eVar.e(f11887f, k0Var.e);
        eVar.e(f11888g, k0Var.f11910f);
    }
}
