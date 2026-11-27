package defpackage;
public final class gh7 implements Runnable {
    public final byte a;
    public final hh7 b;

    public gh7(hh7 hh7Var, byte b) {
        this.a = b;
        this.b = hh7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hh7 hh7Var = this.b;
        switch (b) {
            case 0:
                hh7Var.x();
                return;
            default:
                hh7Var.m(true);
                return;
        }
    }
}
