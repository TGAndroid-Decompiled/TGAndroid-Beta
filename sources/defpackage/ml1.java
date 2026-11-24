package defpackage;
public final class ml1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final int c;

    public ml1(mu1 mu1Var, int i, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 1:
                this.b.J(this.c, 0, 0, 0, false, true);
                return;
            case 2:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 3:
                mu1Var.w9(i);
                return;
            case 4:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 5:
                mu1Var.s8(i);
                return;
            case 6:
                mu1Var.r8(i);
                return;
            case 7:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 8:
                mu1Var.Q8(i);
                return;
            default:
                mu1Var.R8(i);
                return;
        }
    }
}
