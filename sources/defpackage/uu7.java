package defpackage;
public final class uu7 implements Runnable {
    public final byte a;
    public final xv7 b;
    public final ao9 c;

    public uu7(xv7 xv7Var, ao9 ao9Var, byte b) {
        this.a = b;
        this.b = xv7Var;
        this.c = ao9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ao9 ao9Var = this.c;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.D0(ao9Var, true);
                return;
            default:
                xv7Var.B0(ao9Var);
                return;
        }
    }
}
