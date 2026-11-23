package gb;
public final class h implements na.d {
    public static final h f13378a = new Object();
    public static final na.c f13379b = na.c.c("sessionId");
    public static final na.c f13380c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13381e = na.c.c("eventTimestampUs");
    public static final na.c f13382f = na.c.c("dataCollectionStatus");
    public static final na.c f13383g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13379b, v0Var.f13453a);
        eVar.a(f13380c, v0Var.f13454b);
        eVar.d(d, v0Var.f13455c);
        eVar.e(f13381e, v0Var.d);
        eVar.a(f13382f, v0Var.f13456e);
        eVar.a(f13383g, v0Var.f13457f);
        eVar.a(h, v0Var.f13458g);
    }
}
