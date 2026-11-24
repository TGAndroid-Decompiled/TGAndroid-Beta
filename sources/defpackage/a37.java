package defpackage;
public final class a37 implements Runnable {
    public final byte a;
    public final b37 b;

    public a37(b37 b37Var, byte b) {
        this.a = b;
        this.b = b37Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b37 b37Var = this.b;
        switch (b) {
            case 0:
                if (b37Var.W != -1) {
                    kk7.f(b37Var.Y.d0.x).j(b37Var.W);
                    b37Var.W = -1;
                    return;
                }
                return;
            case 1:
                b37Var.Y.i();
                return;
            default:
                if (b37Var.W != -1) {
                    kk7.f(b37Var.Y.d0.x).j(b37Var.W);
                    b37Var.W = -1;
                    return;
                }
                return;
        }
    }
}
