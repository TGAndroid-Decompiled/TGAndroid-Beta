package defpackage;
public final class m60 implements zq7 {
    public static final m60 a = new Object();
    public static final sa4 b = sa4.c("timestamp");
    public static final sa4 c = sa4.c("type");
    public static final sa4 d = sa4.c("app");
    public static final sa4 e = sa4.c("device");
    public static final sa4 f = sa4.c("log");
    public static final sa4 g = sa4.c("rollouts");

    @Override
    public final void a(Object obj, Object obj2) {
        yz2 yz2Var = (yz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.g(b, ((t80) yz2Var).a);
        t80 t80Var = (t80) yz2Var;
        ar7Var.a(c, t80Var.b);
        ar7Var.a(d, t80Var.c);
        ar7Var.a(e, t80Var.d);
        ar7Var.a(f, t80Var.e);
        ar7Var.a(g, t80Var.f);
    }
}
