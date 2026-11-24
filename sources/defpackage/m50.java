package defpackage;
public final class m50 implements zn7 {
    public static final m50 a = new Object();
    public static final w84 b = w84.c("eventTimeMs");
    public static final w84 c = w84.c("eventCode");
    public static final w84 d = w84.c("complianceData");
    public static final w84 e = w84.c("eventUptimeMs");
    public static final w84 f = w84.c("sourceExtension");
    public static final w84 g = w84.c("sourceExtensionJsonProto3");
    public static final w84 h = w84.c("timezoneOffsetSeconds");
    public static final w84 i = w84.c("networkConnectionInfo");
    public static final w84 j = w84.c("experimentIds");

    @Override
    public final void a(Object obj, Object obj2) {
        wb6 wb6Var = (wb6) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.g(b, ((aa0) wb6Var).a);
        aa0 aa0Var = (aa0) wb6Var;
        ao7Var.a(c, aa0Var.b);
        ao7Var.a(d, aa0Var.c);
        ao7Var.g(e, aa0Var.d);
        ao7Var.a(f, aa0Var.e);
        ao7Var.a(g, aa0Var.f);
        ao7Var.g(h, aa0Var.g);
        ao7Var.a(i, aa0Var.h);
        ao7Var.a(j, aa0Var.i);
    }
}
