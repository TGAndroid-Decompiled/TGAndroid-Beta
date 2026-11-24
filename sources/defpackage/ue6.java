package defpackage;
public final class ue6 implements Runnable {
    public final byte a;
    public final hj3 b;

    public ue6(hj3 hj3Var, byte b) {
        this.a = b;
        this.b = hj3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hj3 hj3Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new ue6(hj3Var, (byte) 1));
                return;
            default:
                hj3Var.a("CANCELLED");
                return;
        }
    }
}
