package defpackage;
public final class q60 implements cq7 {
    public static final q60 a = new Object();
    public static final wa4 b = wa4.c("pid");
    public static final wa4 c = wa4.c("processName");
    public static final wa4 d = wa4.c("reasonCode");
    public static final wa4 e = wa4.c("importance");
    public static final wa4 f = wa4.c("pss");
    public static final wa4 g = wa4.c("rss");
    public static final wa4 h = wa4.c("timestamp");
    public static final wa4 i = wa4.c("traceFile");
    public static final wa4 j = wa4.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        sz2 sz2Var = (sz2) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.e(b, ((d90) sz2Var).a);
        d90 d90Var = (d90) sz2Var;
        dq7Var.a(c, d90Var.b);
        dq7Var.e(d, d90Var.c);
        dq7Var.e(e, d90Var.d);
        dq7Var.g(f, d90Var.e);
        dq7Var.g(g, d90Var.f);
        dq7Var.g(h, d90Var.g);
        dq7Var.a(i, d90Var.h);
        dq7Var.a(j, d90Var.i);
    }
}
