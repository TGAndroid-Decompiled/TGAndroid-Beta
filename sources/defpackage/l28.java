package defpackage;
public final class l28 implements Runnable {
    public final byte a;
    public final w28 b;

    public l28(w28 w28Var, byte b) {
        this.a = b;
        this.b = w28Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        w28 w28Var = this.b;
        switch (b) {
            case 0:
                if (w28Var.H) {
                    w28Var.b.invalidate();
                    return;
                }
                return;
            case 1:
                w28Var.h();
                return;
            case 2:
                int i = w28.r0;
                w28Var.h();
                return;
            default:
                int i2 = w28.r0;
                w28Var.h();
                return;
        }
    }
}
