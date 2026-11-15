package gb;
public final class h implements na.d {
    public static final h f13032a = new Object();
    public static final na.c f13033b = na.c.c("sessionId");
    public static final na.c f13034c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13035e = na.c.c("eventTimestampUs");
    public static final na.c f13036f = na.c.c("dataCollectionStatus");
    public static final na.c f13037g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13033b, v0Var.f13107a);
        eVar.a(f13034c, v0Var.f13108b);
        eVar.d(d, v0Var.f13109c);
        eVar.e(f13035e, v0Var.d);
        eVar.a(f13036f, v0Var.f13110e);
        eVar.a(f13037g, v0Var.f13111f);
        eVar.a(h, v0Var.f13112g);
    }
}
