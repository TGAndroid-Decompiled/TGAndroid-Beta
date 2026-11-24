package defpackage;
public final class oy6 implements Runnable {
    public final byte a;
    public final xy6 b;

    public oy6(xy6 xy6Var, byte b) {
        this.a = b;
        this.b = xy6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xy6 xy6Var = this.b;
        switch (b) {
            case 0:
                xy6Var.e();
                return;
            case 1:
                xy6.k(xy6Var.q, true, true);
                return;
            default:
                xy6Var.e();
                return;
        }
    }
}
