package defpackage;
public final class tn3 implements Runnable {
    public final byte a;
    public final co3 b;

    public tn3(co3 co3Var, byte b) {
        this.a = b;
        this.b = co3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        co3 co3Var = this.b;
        switch (b) {
            case 0:
                co3Var.d(null);
                return;
            case 1:
                co3Var.g = true;
                co3Var.d(null);
                return;
            case 2:
                co3Var.d(null);
                return;
            default:
                co3Var.f(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
