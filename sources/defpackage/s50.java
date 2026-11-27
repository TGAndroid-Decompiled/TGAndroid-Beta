package defpackage;
public final class s50 implements zq7 {
    public static final s50 a = new Object();
    public static final sa4 b = sa4.c("pid");
    public static final sa4 c = sa4.c("processName");
    public static final sa4 d = sa4.c("reasonCode");
    public static final sa4 e = sa4.c("importance");
    public static final sa4 f = sa4.c("pss");
    public static final sa4 g = sa4.c("rss");
    public static final sa4 h = sa4.c("timestamp");
    public static final sa4 i = sa4.c("traceFile");
    public static final sa4 j = sa4.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        cz2 cz2Var = (cz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.e(b, ((f80) cz2Var).a);
        f80 f80Var = (f80) cz2Var;
        ar7Var.a(c, f80Var.b);
        ar7Var.e(d, f80Var.c);
        ar7Var.e(e, f80Var.d);
        ar7Var.g(f, f80Var.e);
        ar7Var.g(g, f80Var.f);
        ar7Var.g(h, f80Var.g);
        ar7Var.a(i, f80Var.h);
        ar7Var.a(j, f80Var.i);
    }
}
