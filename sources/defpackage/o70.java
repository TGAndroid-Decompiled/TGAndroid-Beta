package defpackage;
public final class o70 implements zq7 {
    public static final o70 a = new Object();
    public static final sa4 b = sa4.c("rolloutId");
    public static final sa4 c = sa4.c("parameterKey");
    public static final sa4 d = sa4.c("parameterValue");
    public static final sa4 e = sa4.c("variantId");
    public static final sa4 f = sa4.c("templateVersion");

    @Override
    public final void a(Object obj, Object obj2) {
        ym9 ym9Var = (ym9) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((ka0) ym9Var).b);
        ka0 ka0Var = (ka0) ym9Var;
        ar7Var.a(c, ka0Var.c);
        ar7Var.a(d, ka0Var.d);
        ar7Var.a(e, ka0Var.e);
        ar7Var.g(f, ka0Var.f);
    }
}
