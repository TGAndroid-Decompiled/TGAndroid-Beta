package defpackage;
public final class a70 implements cq7 {
    public static final a70 a = new Object();
    public static final wa4 b = wa4.c("generator");
    public static final wa4 c = wa4.c("identifier");
    public static final wa4 d = wa4.c("appQualitySessionId");
    public static final wa4 e = wa4.c("startedAt");
    public static final wa4 f = wa4.c("endedAt");
    public static final wa4 g = wa4.c("crashed");
    public static final wa4 h = wa4.c("app");
    public static final wa4 i = wa4.c("user");
    public static final wa4 j = wa4.c("os");
    public static final wa4 k = wa4.c("device");
    public static final wa4 l = wa4.c("events");
    public static final wa4 m = wa4.c("generatorType");

    @Override
    public final void a(Object obj, Object obj2) {
        r03 r03Var = (r03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ((l90) r03Var).a);
        l90 l90Var = (l90) r03Var;
        dq7Var.a(c, l90Var.b.getBytes(s03.a));
        dq7Var.a(d, l90Var.c);
        dq7Var.g(e, l90Var.d);
        dq7Var.a(f, l90Var.e);
        dq7Var.d(g, l90Var.f);
        dq7Var.a(h, l90Var.g);
        dq7Var.a(i, l90Var.h);
        dq7Var.a(j, l90Var.i);
        dq7Var.a(k, l90Var.j);
        dq7Var.a(l, l90Var.k);
        dq7Var.e(m, l90Var.l);
    }
}
