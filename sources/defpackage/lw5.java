package defpackage;
public final class lw5 implements Runnable {
    public final byte a;
    public final nw5 b;
    public final boolean c;

    public lw5(nw5 nw5Var, boolean z, byte b) {
        this.a = b;
        this.b = nw5Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        nw5 nw5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new lw5(nw5Var, z, (byte) 1));
                return;
            default:
                nw5Var.setJoinRequest(z);
                return;
        }
    }
}
