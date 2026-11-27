package defpackage;
public final class ul1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final int c;

    public ul1(zu1 zu1Var, int i, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.b9(i);
                return;
            case 1:
                zu1Var.c9(i);
                return;
            case 2:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 3:
                this.b.J(this.c, 0, 0, 0, false, true);
                return;
            case 4:
                zu1Var.D8(i);
                return;
            case 5:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 6:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
            case 7:
                zu1Var.C8(i);
                return;
            case 8:
                zu1Var.H9(i);
                return;
            default:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                return;
        }
    }
}
