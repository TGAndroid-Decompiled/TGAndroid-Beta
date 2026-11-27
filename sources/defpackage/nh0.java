package defpackage;
public final class nh0 implements Runnable {
    public final byte a;
    public final ph0 b;

    public nh0(ph0 ph0Var, byte b) {
        this.a = b;
        this.b = ph0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ph0 ph0Var = this.b;
        switch (b) {
            case 0:
                ph0Var.a(null, false);
                return;
            default:
                ph0Var.b(true);
                return;
        }
    }
}
