package gb;
public final class h implements na.d {
    public static final h f13691a = new Object();
    public static final na.c f13692b = na.c.c("sessionId");
    public static final na.c f13693c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13694e = na.c.c("eventTimestampUs");
    public static final na.c f13695f = na.c.c("dataCollectionStatus");
    public static final na.c f13696g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13692b, x0Var.f13778a);
        eVar.a(f13693c, x0Var.f13779b);
        eVar.d(d, x0Var.f13780c);
        eVar.e(f13694e, x0Var.d);
        eVar.a(f13695f, x0Var.f13781e);
        eVar.a(f13696g, x0Var.f13782f);
        eVar.a(h, x0Var.f13783g);
    }
}
