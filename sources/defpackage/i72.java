package defpackage;
public final class i72 implements Runnable {
    public final byte a;
    public final zt3 b;

    public i72(zt3 zt3Var, byte b) {
        this.a = b;
        this.b = zt3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zt3 zt3Var = this.b;
        switch (b) {
            case 0:
                yt3 yt3Var = zt3Var.d;
                yt3Var.requestFocus();
                hl.E3(yt3Var);
                return;
            default:
                hl.t1(zt3Var.d);
                return;
        }
    }
}
