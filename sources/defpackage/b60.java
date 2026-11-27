package defpackage;
public final class b60 implements zq7 {
    public static final b60 a = new Object();
    public static final sa4 b = sa4.c("arch");
    public static final sa4 c = sa4.c("model");
    public static final sa4 d = sa4.c("cores");
    public static final sa4 e = sa4.c("ram");
    public static final sa4 f = sa4.c("diskSpace");
    public static final sa4 g = sa4.c("simulator");
    public static final sa4 h = sa4.c("state");
    public static final sa4 i = sa4.c("manufacturer");
    public static final sa4 j = sa4.c("modelClass");

    @Override
    public final void a(Object obj, Object obj2) {
        kz2 kz2Var = (kz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.e(b, ((r80) kz2Var).a);
        r80 r80Var = (r80) kz2Var;
        ar7Var.a(c, r80Var.b);
        ar7Var.e(d, r80Var.c);
        ar7Var.g(e, r80Var.d);
        ar7Var.g(f, r80Var.e);
        ar7Var.d(g, r80Var.f);
        ar7Var.e(h, r80Var.g);
        ar7Var.a(i, r80Var.h);
        ar7Var.a(j, r80Var.i);
    }
}
