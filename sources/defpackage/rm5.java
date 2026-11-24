package defpackage;
public final class rm5 implements Runnable {
    public final byte a;
    public final sm5 b;

    public rm5(sm5 sm5Var, byte b) {
        this.a = b;
        this.b = sm5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sm5 sm5Var = this.b;
        switch (b) {
            case 0:
                sm5Var.e.P(true);
                return;
            default:
                sm5Var.e.P(true);
                return;
        }
    }
}
