package defpackage;
public final class a60 implements zn7 {
    public static final a60 a = new Object();
    public static final w84 b = w84.c("generator");
    public static final w84 c = w84.c("identifier");
    public static final w84 d = w84.c("appQualitySessionId");
    public static final w84 e = w84.c("startedAt");
    public static final w84 f = w84.c("endedAt");
    public static final w84 g = w84.c("crashed");
    public static final w84 h = w84.c("app");
    public static final w84 i = w84.c("user");
    public static final w84 j = w84.c("os");
    public static final w84 k = w84.c("device");
    public static final w84 l = w84.c("events");
    public static final w84 m = w84.c("generatorType");

    @Override
    public final void a(Object obj, Object obj2) {
        gz2 gz2Var = (gz2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, ((l80) gz2Var).a);
        l80 l80Var = (l80) gz2Var;
        ao7Var.a(c, l80Var.b.getBytes(hz2.a));
        ao7Var.a(d, l80Var.c);
        ao7Var.g(e, l80Var.d);
        ao7Var.a(f, l80Var.e);
        ao7Var.d(g, l80Var.f);
        ao7Var.a(h, l80Var.g);
        ao7Var.a(i, l80Var.h);
        ao7Var.a(j, l80Var.i);
        ao7Var.a(k, l80Var.j);
        ao7Var.a(l, l80Var.k);
        ao7Var.e(m, l80Var.l);
    }
}
