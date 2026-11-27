package defpackage;
public final class l60 implements zq7 {
    public static final l60 a = new Object();
    public static final sa4 b = sa4.c("batteryLevel");
    public static final sa4 c = sa4.c("batteryVelocity");
    public static final sa4 d = sa4.c("proximityOn");
    public static final sa4 e = sa4.c("orientation");
    public static final sa4 f = sa4.c("ramUsed");
    public static final sa4 g = sa4.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        tz2 tz2Var = (tz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((f90) tz2Var).a);
        f90 f90Var = (f90) tz2Var;
        ar7Var.e(c, f90Var.b);
        ar7Var.d(d, f90Var.c);
        ar7Var.e(e, f90Var.d);
        ar7Var.g(f, f90Var.e);
        ar7Var.g(g, f90Var.f);
    }
}
