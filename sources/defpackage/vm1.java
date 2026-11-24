package defpackage;
public final class vm1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final int c;

    public vm1(yv1 yv1Var, int i, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 1:
                this.b.J(this.c, 0, 0, 0, false, true);
                return;
            case 2:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 3:
                yv1Var.G9(i);
                return;
            case 4:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 5:
                yv1Var.C8(i);
                return;
            case 6:
                yv1Var.B8(i);
                return;
            case 7:
                yv1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 8:
                yv1Var.a9(i);
                return;
            default:
                yv1Var.b9(i);
                return;
        }
    }
}
