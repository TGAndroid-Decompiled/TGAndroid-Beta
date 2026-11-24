package defpackage;
public final class m60 implements zn7 {
    public static final m60 a = new Object();
    public static final w84 b = w84.c("rolloutVariant");
    public static final w84 c = w84.c("parameterKey");
    public static final w84 d = w84.c("parameterValue");
    public static final w84 e = w84.c("templateVersion");

    @Override
    public final void a(Object obj, Object obj2) {
        bz2 bz2Var = (bz2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, ((g90) bz2Var).a);
        g90 g90Var = (g90) bz2Var;
        ao7Var.a(c, g90Var.b);
        ao7Var.a(d, g90Var.c);
        ao7Var.g(e, g90Var.d);
    }
}
