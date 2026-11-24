package defpackage;
public final class mo3 implements Runnable {
    public final byte a;
    public final vo3 b;

    public mo3(vo3 vo3Var, byte b) {
        this.a = b;
        this.b = vo3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vo3 vo3Var = this.b;
        switch (b) {
            case 0:
                vo3Var.d(null);
                return;
            case 1:
                vo3Var.g = true;
                vo3Var.d(null);
                return;
            case 2:
                vo3Var.d(null);
                return;
            default:
                vo3Var.f(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
