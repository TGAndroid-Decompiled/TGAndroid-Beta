package defpackage;
public final class v07 implements Runnable {
    public final byte a;
    public final e17 b;

    public v07(e17 e17Var, byte b) {
        this.a = b;
        this.b = e17Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e17 e17Var = this.b;
        switch (b) {
            case 0:
                e17Var.e();
                return;
            case 1:
                e17.k(e17Var.q, true, true);
                return;
            default:
                e17Var.e();
                return;
        }
    }
}
