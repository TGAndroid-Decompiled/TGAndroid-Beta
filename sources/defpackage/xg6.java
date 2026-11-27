package defpackage;
public final class xg6 implements Runnable {
    public final byte a;
    public final zj3 b;

    public xg6(zj3 zj3Var, byte b) {
        this.a = b;
        this.b = zj3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zj3 zj3Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new xg6(zj3Var, (byte) 1));
                return;
            default:
                zj3Var.a("CANCELLED");
                return;
        }
    }
}
