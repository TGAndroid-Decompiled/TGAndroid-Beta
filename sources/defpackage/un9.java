package defpackage;
public final class un9 implements Runnable {
    public final byte a;
    public final xn9 b;

    public un9(xn9 xn9Var, byte b) {
        this.a = b;
        this.b = xn9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xn9 xn9Var = this.b;
        switch (b) {
            case 0:
                if (xn9Var.W != 0) {
                    xn9Var.V = true;
                    return;
                }
                return;
            default:
                xn9Var.c();
                return;
        }
    }
}
