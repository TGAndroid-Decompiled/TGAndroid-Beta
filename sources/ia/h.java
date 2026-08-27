package ia;

public final class h implements r9.d {

    public static final h f11014a = new h();

    public static final r9.c f11015b = r9.c.c("sessionId");

    public static final r9.c f11016c = r9.c.c("firstSessionId");
    public static final r9.c d = r9.c.c("sessionIndex");

    public static final r9.c f11017e = r9.c.c("eventTimestampUs");

    public static final r9.c f11018f = r9.c.c("dataCollectionStatus");

    public static final r9.c f11019g = r9.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f11015b, o0Var.f11062a);
        eVar.a(f11016c, o0Var.f11063b);
        eVar.d(d, o0Var.f11064c);
        eVar.c(f11017e, o0Var.d);
        eVar.a(f11018f, o0Var.f11065e);
        eVar.a(f11019g, o0Var.f11066f);
    }
}
