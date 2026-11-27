package defpackage;
public final class ue implements Runnable {
    public final byte a;
    public final cf7 b;

    public ue(cf7 cf7Var, byte b) {
        this.a = b;
        this.b = cf7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                cf7Var.A(false);
                return;
            case 1:
                cf7Var.A(false);
                return;
            default:
                cf7Var.A(true);
                return;
        }
    }
}
