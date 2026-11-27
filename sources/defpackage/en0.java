package defpackage;
public final class en0 implements Runnable {
    public final byte a;
    public final tn0 b;

    public en0(tn0 tn0Var, byte b) {
        this.a = b;
        this.b = tn0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tn0 tn0Var = this.b;
        switch (b) {
            case 0:
                tn0Var.a(null);
                return;
            default:
                hl.c3(new en0(tn0Var, (byte) 0));
                return;
        }
    }
}
