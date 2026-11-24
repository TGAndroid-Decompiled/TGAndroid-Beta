package defpackage;
public final class z60 implements cq7 {
    public static final z60 a = new Object();
    public static final wa4 b = wa4.c("arch");
    public static final wa4 c = wa4.c("model");
    public static final wa4 d = wa4.c("cores");
    public static final wa4 e = wa4.c("ram");
    public static final wa4 f = wa4.c("diskSpace");
    public static final wa4 g = wa4.c("simulator");
    public static final wa4 h = wa4.c("state");
    public static final wa4 i = wa4.c("manufacturer");
    public static final wa4 j = wa4.c("modelClass");

    @Override
    public final void a(Object obj, Object obj2) {
        a03 a03Var = (a03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.e(b, ((p90) a03Var).a);
        p90 p90Var = (p90) a03Var;
        dq7Var.a(c, p90Var.b);
        dq7Var.e(d, p90Var.c);
        dq7Var.g(e, p90Var.d);
        dq7Var.g(f, p90Var.e);
        dq7Var.d(g, p90Var.f);
        dq7Var.e(h, p90Var.g);
        dq7Var.a(i, p90Var.h);
        dq7Var.a(j, p90Var.i);
    }
}
