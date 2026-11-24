package defpackage;
public final class e81 implements Runnable {
    public final byte a;
    public final z81 b;

    public e81(z81 z81Var, byte b) {
        this.a = b;
        this.b = z81Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z81 z81Var = this.b;
        switch (b) {
            case 0:
                z81Var.k0(false);
                return;
            default:
                z81Var.b0();
                return;
        }
    }
}
