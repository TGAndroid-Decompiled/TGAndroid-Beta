package defpackage;
public final class iv2 implements Runnable {
    public final byte a;
    public final xv2 b;

    public iv2(xv2 xv2Var, byte b) {
        this.a = b;
        this.b = xv2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xv2 xv2Var = this.b;
        switch (b) {
            case 0:
                xv2Var.c0 = null;
                return;
            case 1:
                xv2Var.A.g0(null);
                ju7 ju7Var = xv2Var.C;
                if (ju7Var != null) {
                    ju7Var.a();
                    xv2Var.z.removeView(xv2Var.C);
                    xv2Var.C = null;
                    return;
                }
                return;
            default:
                xv2Var.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(s33.h).start();
                return;
        }
    }
}
