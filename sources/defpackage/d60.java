package defpackage;
public final class d60 implements zq7 {
    public static final d60 a = new Object();
    public static final sa4 b = sa4.c("execution");
    public static final sa4 c = sa4.c("customAttributes");
    public static final sa4 d = sa4.c("internalKeys");
    public static final sa4 e = sa4.c("background");
    public static final sa4 f = sa4.c("currentProcessDetails");
    public static final sa4 g = sa4.c("appProcessDetails");
    public static final sa4 h = sa4.c("uiOrientation");

    @Override
    public final void a(Object obj, Object obj2) {
        sz2 sz2Var = (sz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((v80) sz2Var).a);
        v80 v80Var = (v80) sz2Var;
        ar7Var.a(c, v80Var.b);
        ar7Var.a(d, v80Var.c);
        ar7Var.a(e, v80Var.d);
        ar7Var.a(f, v80Var.e);
        ar7Var.a(g, v80Var.f);
        ar7Var.e(h, v80Var.g);
    }
}
