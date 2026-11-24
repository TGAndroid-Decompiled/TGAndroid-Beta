package defpackage;
public final class hu5 implements Runnable {
    public final byte a;
    public final ju5 b;
    public final boolean c;

    public hu5(ju5 ju5Var, boolean z, byte b) {
        this.a = b;
        this.b = ju5Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        ju5 ju5Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new hu5(ju5Var, z, (byte) 1));
                return;
            default:
                ju5Var.setJoinRequest(z);
                return;
        }
    }
}
