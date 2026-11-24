package defpackage;
public final class m60 implements cq7 {
    public static final m60 a = new Object();
    public static final wa4 b = wa4.c("eventTimeMs");
    public static final wa4 c = wa4.c("eventCode");
    public static final wa4 d = wa4.c("complianceData");
    public static final wa4 e = wa4.c("eventUptimeMs");
    public static final wa4 f = wa4.c("sourceExtension");
    public static final wa4 g = wa4.c("sourceExtensionJsonProto3");
    public static final wa4 h = wa4.c("timezoneOffsetSeconds");
    public static final wa4 i = wa4.c("networkConnectionInfo");
    public static final wa4 j = wa4.c("experimentIds");

    @Override
    public final void a(Object obj, Object obj2) {
        vd6 vd6Var = (vd6) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, ((ab0) vd6Var).a);
        ab0 ab0Var = (ab0) vd6Var;
        dq7Var.a(c, ab0Var.b);
        dq7Var.a(d, ab0Var.c);
        dq7Var.g(e, ab0Var.d);
        dq7Var.a(f, ab0Var.e);
        dq7Var.a(g, ab0Var.f);
        dq7Var.g(h, ab0Var.g);
        dq7Var.a(i, ab0Var.h);
        dq7Var.a(j, ab0Var.i);
    }
}
