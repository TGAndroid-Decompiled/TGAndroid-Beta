package defpackage;
public final class wr1 implements Runnable {
    public final byte a;
    public final xr1 b;

    public wr1(xr1 xr1Var, byte b) {
        this.a = b;
        this.b = xr1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xr1 xr1Var = this.b;
        switch (b) {
            case 0:
                xr1Var.W = null;
                yv1 yv1Var = xr1Var.X;
                if (yv1Var.ea != -1) {
                    yv1Var.getNotificationCenter().j(yv1Var.ea);
                    yv1Var.ea = -1;
                }
                if (e21.a) {
                    fc4.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                xr1Var.W = null;
                yv1 yv1Var2 = xr1Var.X;
                if (yv1Var2.ea != -1) {
                    yv1Var2.getNotificationCenter().j(yv1Var2.ea);
                    yv1Var2.ea = -1;
                }
                if (e21.a) {
                    fc4.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
