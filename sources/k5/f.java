package k5;
public final class f implements ia.d {
    public static final f f12305a = new Object();
    public static final ia.c f12306b = ia.c.c("requestTimeMs");
    public static final ia.c f12307c = ia.c.c("requestUptimeMs");
    public static final ia.c d = ia.c.c("clientInfo");
    public static final ia.c e = ia.c.c("logSource");
    public static final ia.c f12308f = ia.c.c("logSourceName");
    public static final ia.c f12309g = ia.c.c("logEvent");
    public static final ia.c h = ia.c.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.f(f12306b, lVar.f12329a);
        eVar.f(f12307c, lVar.f12330b);
        eVar.a(d, lVar.f12331c);
        eVar.a(e, lVar.d);
        eVar.a(f12308f, lVar.e);
        eVar.a(f12309g, lVar.f12332f);
        eVar.a(h, w.f12342a);
    }
}
