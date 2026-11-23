package gb;
public final class h implements na.d {
    public static final h f13339a = new Object();
    public static final na.c f13340b = na.c.c("sessionId");
    public static final na.c f13341c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c f13342e = na.c.c("eventTimestampUs");
    public static final na.c f13343f = na.c.c("dataCollectionStatus");
    public static final na.c f13344g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13340b, w0Var.f13420a);
        eVar.a(f13341c, w0Var.f13421b);
        eVar.d(d, w0Var.f13422c);
        eVar.e(f13342e, w0Var.d);
        eVar.a(f13343f, w0Var.f13423e);
        eVar.a(f13344g, w0Var.f13424f);
        eVar.a(h, w0Var.f13425g);
    }
}
