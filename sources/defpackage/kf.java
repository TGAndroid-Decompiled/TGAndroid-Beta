package defpackage;
public final class kf implements Runnable {
    public final byte a;
    public final sc7 b;

    public kf(sc7 sc7Var, byte b) {
        this.a = b;
        this.b = sc7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sc7 sc7Var = this.b;
        switch (b) {
            case 0:
                sc7Var.k(false);
                return;
            case 1:
                sc7Var.k(false);
                return;
            default:
                sc7Var.k(true);
                return;
        }
    }
}
