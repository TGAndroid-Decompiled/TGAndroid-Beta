package defpackage;
public final class l0b implements Runnable {
    public final byte a;
    public final dx8 b;

    public l0b(dx8 dx8Var, byte b) {
        this.a = b;
        this.b = dx8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dx8 dx8Var = this.b;
        switch (b) {
            case 0:
                dx8Var.b();
                return;
            default:
                dx8Var.b();
                return;
        }
    }
}
