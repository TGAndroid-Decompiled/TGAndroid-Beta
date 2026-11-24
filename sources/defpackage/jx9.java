package defpackage;
public final class jx9 implements Runnable {
    public final byte a;
    public final kx9 b;

    public jx9(kx9 kx9Var, byte b) {
        this.a = b;
        this.b = kx9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kx9 kx9Var = this.b;
        switch (b) {
            case 0:
                kx9Var.b();
                return;
            default:
                kx9Var.dismiss();
                return;
        }
    }
}
