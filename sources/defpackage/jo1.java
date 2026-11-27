package defpackage;
public final class jo1 implements Runnable {
    public final byte a;
    public final n8 b;

    public jo1(n8 n8Var, byte b) {
        this.a = b;
        this.b = n8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        n8 n8Var = this.b;
        switch (b) {
            case 0:
                n8Var.d(true);
                return;
            default:
                n8Var.d(true);
                return;
        }
    }
}
