package defpackage;
public final class gw5 implements Runnable {
    public final byte a;
    public final iw5 b;
    public final boolean c;

    public gw5(iw5 iw5Var, boolean z, byte b) {
        this.a = b;
        this.b = iw5Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        iw5 iw5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new gw5(iw5Var, z, (byte) 1));
                return;
            default:
                iw5Var.setJoinRequest(z);
                return;
        }
    }
}
