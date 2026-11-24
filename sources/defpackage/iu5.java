package defpackage;
public final class iu5 implements Runnable {
    public final byte a;
    public final ju5 b;
    public final boolean c;
    public final boolean d;

    public iu5(ju5 ju5Var, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = ju5Var;
        this.c = z;
        this.d = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        ju5 ju5Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new iu5(ju5Var, z2, z, (byte) 1));
                return;
            default:
                ju5Var.setJoinRequest(z2);
                ju5Var.setJoinToSend(z);
                return;
        }
    }
}
