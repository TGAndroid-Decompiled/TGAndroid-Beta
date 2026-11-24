package defpackage;
public final class cn3 implements Runnable {
    public final byte a;
    public final ln3 b;

    public cn3(ln3 ln3Var, byte b) {
        this.a = b;
        this.b = ln3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ln3 ln3Var = this.b;
        switch (b) {
            case 0:
                ln3Var.d(null);
                return;
            case 1:
                ln3Var.g = true;
                ln3Var.d(null);
                return;
            case 2:
                ln3Var.d(null);
                return;
            default:
                ln3Var.f(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
