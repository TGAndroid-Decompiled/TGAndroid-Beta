package k5;
public final class e implements ia.d {
    public static final e f12300a = new Object();
    public static final ia.c f12301b = ia.c.c("eventTimeMs");
    public static final ia.c f12302c = ia.c.c("eventCode");
    public static final ia.c d = ia.c.c("eventUptimeMs");
    public static final ia.c e = ia.c.c("sourceExtension");
    public static final ia.c f12303f = ia.c.c("sourceExtensionJsonProto3");
    public static final ia.c f12304g = ia.c.c("timezoneOffsetSeconds");
    public static final ia.c h = ia.c.c("networkConnectionInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.f(f12301b, kVar.f12324a);
        eVar.a(f12302c, kVar.f12325b);
        eVar.f(d, kVar.f12326c);
        eVar.a(e, kVar.d);
        eVar.a(f12303f, kVar.e);
        eVar.f(f12304g, kVar.f12327f);
        eVar.a(h, kVar.f12328g);
    }
}
