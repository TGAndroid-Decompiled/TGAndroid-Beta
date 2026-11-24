package defpackage;
public final class gj9 implements Runnable {
    public final byte a;
    public final ij9 b;

    public gj9(ij9 ij9Var, byte b) {
        this.a = b;
        this.b = ij9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ij9 ij9Var = this.b;
        switch (b) {
            case 0:
                ij9Var.g(false);
                return;
            default:
                kk7.f(ij9Var.c).k(310, new Object[0]);
                return;
        }
    }
}
