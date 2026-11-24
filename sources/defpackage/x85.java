package defpackage;
public final class x85 implements Runnable {
    public final byte a;
    public final z85 b;

    public x85(z85 z85Var, byte b) {
        this.a = b;
        this.b = z85Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z85 z85Var = this.b;
        switch (b) {
            case 0:
                int i = z85.W;
                z85Var.a();
                return;
            default:
                int i2 = z85.W;
                z85Var.a();
                return;
        }
    }
}
