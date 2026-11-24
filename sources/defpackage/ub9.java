package defpackage;
public final class ub9 implements Runnable {
    public final byte a;
    public final yb9 b;

    public ub9(yb9 yb9Var, byte b) {
        this.a = b;
        this.b = yb9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yb9 yb9Var = this.b;
        switch (b) {
            case 0:
                yb9Var.Y0();
                return;
            default:
                yb9Var.d2.O(true);
                gm.d3(new ub9(yb9Var, (byte) 0), 150L);
                return;
        }
    }
}
