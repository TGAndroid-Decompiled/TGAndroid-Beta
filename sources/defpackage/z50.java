package defpackage;
public final class z50 implements zn7 {
    public static final z50 a = new Object();
    public static final w84 b = w84.c("arch");
    public static final w84 c = w84.c("model");
    public static final w84 d = w84.c("cores");
    public static final w84 e = w84.c("ram");
    public static final w84 f = w84.c("diskSpace");
    public static final w84 g = w84.c("simulator");
    public static final w84 h = w84.c("state");
    public static final w84 i = w84.c("manufacturer");
    public static final w84 j = w84.c("modelClass");

    @Override
    public final void a(Object obj, Object obj2) {
        py2 py2Var = (py2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.e(b, ((p80) py2Var).a);
        p80 p80Var = (p80) py2Var;
        ao7Var.a(c, p80Var.b);
        ao7Var.e(d, p80Var.c);
        ao7Var.g(e, p80Var.d);
        ao7Var.g(f, p80Var.e);
        ao7Var.d(g, p80Var.f);
        ao7Var.e(h, p80Var.g);
        ao7Var.a(i, p80Var.h);
        ao7Var.a(j, p80Var.i);
    }
}
