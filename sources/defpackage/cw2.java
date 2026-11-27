package defpackage;
public final class cw2 implements Runnable {
    public final byte a;
    public final rw2 b;

    public cw2(rw2 rw2Var, byte b) {
        this.a = b;
        this.b = rw2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rw2 rw2Var = this.b;
        switch (b) {
            case 0:
                rw2Var.c0 = null;
                return;
            case 1:
                rw2Var.A.g0(null);
                qx7 qx7Var = rw2Var.C;
                if (qx7Var != null) {
                    qx7Var.a();
                    rw2Var.z.removeView(rw2Var.C);
                    rw2Var.C = null;
                    return;
                }
                return;
            default:
                rw2Var.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(k43.h).start();
                return;
        }
    }
}
