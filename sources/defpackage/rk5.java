package defpackage;
public final class rk5 implements Runnable {
    public final byte a;
    public final sk5 b;

    public rk5(sk5 sk5Var, byte b) {
        this.a = b;
        this.b = sk5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sk5 sk5Var = this.b;
        switch (b) {
            case 0:
                sk5Var.e.P(true);
                return;
            default:
                sk5Var.e.P(true);
                return;
        }
    }
}
