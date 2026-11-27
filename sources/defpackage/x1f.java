package defpackage;
public abstract class x1f {
    public static final Object a(ju9 ju9Var, ju9 ju9Var2, is4 is4Var) {
        Object yp2Var;
        Object C;
        try {
            q7c.a(2, is4Var);
            yp2Var = is4Var.invoke(ju9Var2, ju9Var);
        } catch (Throwable th) {
            yp2Var = new yp2(th, false);
        }
        vx2 vx2Var = vx2.a;
        if (yp2Var != vx2Var && (C = ju9Var.C(yp2Var)) != yed.b) {
            if (!(C instanceof yp2)) {
                return yed.a(C);
            }
            throw ((yp2) C).a;
        }
        return vx2Var;
    }
}
