package gb;
public final class h implements na.d {
    public static final h f13341a = new Object();
    public static final na.c f13342b = na.c.c("sessionId");
    public static final na.c f13343c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13344e = na.c.c("eventTimestampUs");
    public static final na.c f13345f = na.c.c("dataCollectionStatus");
    public static final na.c f13346g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13342b, v0Var.f13416a);
        eVar.a(f13343c, v0Var.f13417b);
        eVar.d(d, v0Var.f13418c);
        eVar.e(f13344e, v0Var.d);
        eVar.a(f13345f, v0Var.f13419e);
        eVar.a(f13346g, v0Var.f13420f);
        eVar.a(h, v0Var.f13421g);
    }
}
