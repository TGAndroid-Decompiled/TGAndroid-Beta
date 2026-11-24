package defpackage;
public final class o07 implements Runnable {
    public final byte a;
    public final x07 b;

    public o07(x07 x07Var, byte b) {
        this.a = b;
        this.b = x07Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x07 x07Var = this.b;
        switch (b) {
            case 0:
                x07Var.e();
                return;
            case 1:
                x07.k(x07Var.q, true, true);
                return;
            default:
                x07Var.e();
                return;
        }
    }
}
