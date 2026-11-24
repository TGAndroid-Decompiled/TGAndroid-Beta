package defpackage;
public final class j70 implements cq7 {
    public static final j70 a = new Object();
    public static final wa4 b = wa4.c("batteryLevel");
    public static final wa4 c = wa4.c("batteryVelocity");
    public static final wa4 d = wa4.c("proximityOn");
    public static final wa4 e = wa4.c("orientation");
    public static final wa4 f = wa4.c("ramUsed");
    public static final wa4 g = wa4.c("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        j03 j03Var = (j03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ((da0) j03Var).a);
        da0 da0Var = (da0) j03Var;
        dq7Var.e(c, da0Var.b);
        dq7Var.d(d, da0Var.c);
        dq7Var.e(e, da0Var.d);
        dq7Var.g(f, da0Var.e);
        dq7Var.g(g, da0Var.f);
    }
}
