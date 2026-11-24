package defpackage;
public final class k70 implements cq7 {
    public static final k70 a = new Object();
    public static final wa4 b = wa4.c("timestamp");
    public static final wa4 c = wa4.c("type");
    public static final wa4 d = wa4.c("app");
    public static final wa4 e = wa4.c("device");
    public static final wa4 f = wa4.c("log");
    public static final wa4 g = wa4.c("rollouts");

    @Override
    public final void a(Object obj, Object obj2) {
        o03 o03Var = (o03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, ((r90) o03Var).a);
        r90 r90Var = (r90) o03Var;
        dq7Var.a(c, r90Var.b);
        dq7Var.a(d, r90Var.c);
        dq7Var.a(e, r90Var.d);
        dq7Var.a(f, r90Var.e);
        dq7Var.a(g, r90Var.f);
    }
}
