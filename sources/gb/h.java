package gb;
public final class h implements na.d {
    public static final h f13375a = new Object();
    public static final na.c f13376b = na.c.c("sessionId");
    public static final na.c f13377c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13378e = na.c.c("eventTimestampUs");
    public static final na.c f13379f = na.c.c("dataCollectionStatus");
    public static final na.c f13380g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13376b, v0Var.f13450a);
        eVar.a(f13377c, v0Var.f13451b);
        eVar.d(d, v0Var.f13452c);
        eVar.e(f13378e, v0Var.d);
        eVar.a(f13379f, v0Var.f13453e);
        eVar.a(f13380g, v0Var.f13454f);
        eVar.a(h, v0Var.f13455g);
    }
}
