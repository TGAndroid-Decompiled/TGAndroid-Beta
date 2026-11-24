package defpackage;
public final class nn0 implements Runnable {
    public final byte a;
    public final tn0 b;

    public nn0(tn0 tn0Var, byte b) {
        this.a = b;
        this.b = tn0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tn0 tn0Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new nn0(tn0Var, (byte) 1));
                return;
            default:
                tn0Var.a(null);
                return;
        }
    }
}
