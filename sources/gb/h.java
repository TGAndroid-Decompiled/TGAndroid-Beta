package gb;
public final class h implements na.d {
    public static final h f13689a = new Object();
    public static final na.c f13690b = na.c.c("sessionId");
    public static final na.c f13691c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13692e = na.c.c("eventTimestampUs");
    public static final na.c f13693f = na.c.c("dataCollectionStatus");
    public static final na.c f13694g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13690b, x0Var.f13776a);
        eVar.a(f13691c, x0Var.f13777b);
        eVar.d(d, x0Var.f13778c);
        eVar.e(f13692e, x0Var.d);
        eVar.a(f13693f, x0Var.f13779e);
        eVar.a(f13694g, x0Var.f13780f);
        eVar.a(h, x0Var.f13781g);
    }
}
