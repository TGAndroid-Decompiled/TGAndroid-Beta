package gb;
public final class h implements na.d {
    public static final h f13346a = new Object();
    public static final na.c f13347b = na.c.c("sessionId");
    public static final na.c f13348c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13349e = na.c.c("eventTimestampUs");
    public static final na.c f13350f = na.c.c("dataCollectionStatus");
    public static final na.c f13351g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13347b, v0Var.f13421a);
        eVar.a(f13348c, v0Var.f13422b);
        eVar.d(d, v0Var.f13423c);
        eVar.e(f13349e, v0Var.d);
        eVar.a(f13350f, v0Var.f13424e);
        eVar.a(f13351g, v0Var.f13425f);
        eVar.a(h, v0Var.f13426g);
    }
}
