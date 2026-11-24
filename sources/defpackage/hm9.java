package defpackage;
public final class hm9 implements Runnable {
    public final byte a;
    public final km9 b;

    public hm9(km9 km9Var, byte b) {
        this.a = b;
        this.b = km9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        km9 km9Var = this.b;
        switch (b) {
            case 0:
                if (km9Var.W != 0) {
                    km9Var.V = true;
                    return;
                }
                return;
            default:
                km9Var.c();
                return;
        }
    }
}
