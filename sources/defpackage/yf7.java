package defpackage;
public final class yf7 implements Runnable {
    public final byte a;
    public final gg7 b;

    public yf7(gg7 gg7Var, byte b) {
        this.a = b;
        this.b = gg7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gg7 gg7Var = this.b;
        switch (b) {
            case 0:
                gg7Var.dismiss();
                return;
            case 1:
                gg7Var.b1(true, false);
                return;
            default:
                gg7Var.b1(true, false);
                return;
        }
    }
}
