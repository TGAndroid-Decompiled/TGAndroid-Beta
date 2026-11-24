package defpackage;
public final class kq1 implements Runnable {
    public final byte a;
    public final lq1 b;

    public kq1(lq1 lq1Var, byte b) {
        this.a = b;
        this.b = lq1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lq1 lq1Var = this.b;
        switch (b) {
            case 0:
                lq1Var.W = null;
                mu1 mu1Var = lq1Var.X;
                if (mu1Var.ea != -1) {
                    mu1Var.getNotificationCenter().j(mu1Var.ea);
                    mu1Var.ea = -1;
                }
                if (w01.a) {
                    fa4.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                lq1Var.W = null;
                mu1 mu1Var2 = lq1Var.X;
                if (mu1Var2.ea != -1) {
                    mu1Var2.getNotificationCenter().j(mu1Var2.ea);
                    mu1Var2.ea = -1;
                }
                if (w01.a) {
                    fa4.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
