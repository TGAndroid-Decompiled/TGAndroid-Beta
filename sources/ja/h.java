package ja;
public final class h implements s9.d {
    public static final h f11338a = new Object();
    public static final s9.c f11339b = s9.c.c("sessionId");
    public static final s9.c f11340c = s9.c.c("firstSessionId");
    public static final s9.c d = s9.c.c("sessionIndex");
    public static final s9.c f11341e = s9.c.c("eventTimestampUs");
    public static final s9.c f11342f = s9.c.c("dataCollectionStatus");
    public static final s9.c f11343g = s9.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11339b, n0Var.f11385a);
        eVar.e(f11340c, n0Var.f11386b);
        eVar.b(d, n0Var.f11387c);
        eVar.c(f11341e, n0Var.d);
        eVar.e(f11342f, n0Var.f11388e);
        eVar.e(f11343g, n0Var.f11389f);
    }
}
