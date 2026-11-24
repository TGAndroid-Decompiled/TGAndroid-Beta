package defpackage;
public final class h60 implements zn7 {
    public static final h60 a = new Object();
    public static final w84 b = w84.c("pc");
    public static final w84 c = w84.c("symbol");
    public static final w84 d = w84.c("file");
    public static final w84 e = w84.c("offset");
    public static final w84 f = w84.c("importance");

    @Override
    public final void a(Object obj, Object obj2) {
        ty2 ty2Var = (ty2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.g(b, ((a90) ty2Var).a);
        a90 a90Var = (a90) ty2Var;
        ao7Var.a(c, a90Var.b);
        ao7Var.a(d, a90Var.c);
        ao7Var.g(e, a90Var.d);
        ao7Var.e(f, a90Var.e);
    }
}
