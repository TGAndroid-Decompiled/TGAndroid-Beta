package defpackage;
public final class hw5 implements Runnable {
    public final byte a;
    public final iw5 b;
    public final boolean c;
    public final boolean d;

    public hw5(iw5 iw5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = iw5Var;
        this.c = z;
        this.d = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        iw5 iw5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new hw5(iw5Var, z2, z, (byte) 1));
                return;
            default:
                iw5Var.setJoinRequest(z2);
                iw5Var.setJoinToSend(z);
                return;
        }
    }
}
