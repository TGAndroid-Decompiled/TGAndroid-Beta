package gb;
public final class h implements na.d {
    public static final h f13349a = new Object();
    public static final na.c f13350b = na.c.c("sessionId");
    public static final na.c f13351c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13352e = na.c.c("eventTimestampUs");
    public static final na.c f13353f = na.c.c("dataCollectionStatus");
    public static final na.c f13354g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13350b, v0Var.f13424a);
        eVar.a(f13351c, v0Var.f13425b);
        eVar.d(d, v0Var.f13426c);
        eVar.e(f13352e, v0Var.d);
        eVar.a(f13353f, v0Var.f13427e);
        eVar.a(f13354g, v0Var.f13428f);
        eVar.a(h, v0Var.f13429g);
    }
}
