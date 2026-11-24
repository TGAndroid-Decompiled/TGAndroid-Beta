package defpackage;
public final class ut4 implements Runnable {
    public final byte a;
    public final xt4 b;

    public ut4(xt4 xt4Var, byte b) {
        this.a = b;
        this.b = xt4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xt4 xt4Var = this.b;
        switch (b) {
            case 0:
                xt4Var.dismiss();
                return;
            default:
                xt4Var.E0();
                return;
        }
    }
}
