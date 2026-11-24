package defpackage;
public final class hl9 implements Runnable {
    public final byte a;
    public final kl9 b;

    public hl9(kl9 kl9Var, byte b) {
        this.a = b;
        this.b = kl9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kl9 kl9Var = this.b;
        switch (b) {
            case 0:
                kl9Var.g(false);
                return;
            default:
                nm7.f(kl9Var.c).k(312, new Object[0]);
                return;
        }
    }
}
