package defpackage;
public final class mw5 implements Runnable {
    public final byte a;
    public final nw5 b;
    public final boolean c;
    public final boolean d;

    public mw5(nw5 nw5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = nw5Var;
        this.c = z;
        this.d = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        nw5 nw5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new mw5(nw5Var, z2, z, (byte) 1));
                return;
            default:
                nw5Var.setJoinRequest(z2);
                nw5Var.setJoinToSend(z);
                return;
        }
    }
}
