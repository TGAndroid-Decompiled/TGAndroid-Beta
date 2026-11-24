package defpackage;
public final class sw2 implements Runnable {
    public final byte a;
    public final hx2 b;

    public sw2(hx2 hx2Var, byte b) {
        this.a = b;
        this.b = hx2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hx2 hx2Var = this.b;
        switch (b) {
            case 0:
                hx2Var.c0 = null;
                return;
            case 1:
                hx2Var.A.g0(null);
                kw7 kw7Var = hx2Var.C;
                if (kw7Var != null) {
                    kw7Var.a();
                    hx2Var.z.removeView(hx2Var.C);
                    hx2Var.C = null;
                    return;
                }
                return;
            default:
                hx2Var.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(d53.h).start();
                return;
        }
    }
}
