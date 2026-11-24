package defpackage;
public final class hf4 implements Runnable {
    public final byte a;
    public final kf4 b;

    public hf4(kf4 kf4Var, byte b) {
        this.a = b;
        this.b = kf4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kf4 kf4Var = this.b;
        switch (b) {
            case 0:
                kf4Var.d();
                return;
            case 1:
                kf4Var.a();
                return;
            default:
                kf4Var.b(kf4Var.E);
                return;
        }
    }
}
