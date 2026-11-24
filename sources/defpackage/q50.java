package defpackage;
public final class q50 implements zn7 {
    public static final q50 a = new Object();
    public static final w84 b = w84.c("pid");
    public static final w84 c = w84.c("processName");
    public static final w84 d = w84.c("reasonCode");
    public static final w84 e = w84.c("importance");
    public static final w84 f = w84.c("pss");
    public static final w84 g = w84.c("rss");
    public static final w84 h = w84.c("timestamp");
    public static final w84 i = w84.c("traceFile");
    public static final w84 j = w84.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        hy2 hy2Var = (hy2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.e(b, ((d80) hy2Var).a);
        d80 d80Var = (d80) hy2Var;
        ao7Var.a(c, d80Var.b);
        ao7Var.e(d, d80Var.c);
        ao7Var.e(e, d80Var.d);
        ao7Var.g(f, d80Var.e);
        ao7Var.g(g, d80Var.f);
        ao7Var.g(h, d80Var.g);
        ao7Var.a(i, d80Var.h);
        ao7Var.a(j, d80Var.i);
    }
}
