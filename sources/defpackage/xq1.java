package defpackage;
public final class xq1 implements Runnable {
    public final byte a;
    public final yq1 b;

    public xq1(yq1 yq1Var, byte b) {
        this.a = b;
        this.b = yq1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yq1 yq1Var = this.b;
        switch (b) {
            case 0:
                yq1Var.W = null;
                zu1 zu1Var = yq1Var.X;
                if (zu1Var.ea != -1) {
                    zu1Var.getNotificationCenter().j(zu1Var.ea);
                    zu1Var.ea = -1;
                }
                if (f11.a) {
                    cc4.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                yq1Var.W = null;
                zu1 zu1Var2 = yq1Var.X;
                if (zu1Var2.ea != -1) {
                    zu1Var2.getNotificationCenter().j(zu1Var2.ea);
                    zu1Var2.ea = -1;
                }
                if (f11.a) {
                    cc4.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
