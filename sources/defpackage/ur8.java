package defpackage;
public final class ur8 implements Runnable {
    public final byte a;
    public final xr8 b;
    public final int c;

    public ur8(xr8 xr8Var, int i, byte b) {
        this.a = b;
        this.b = xr8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        xr8 xr8Var = this.b;
        switch (b) {
            case 0:
                xr8Var.b.e(i, xr8Var.d.i(i));
                return;
            default:
                xr8Var.b.e(i, xr8Var.d.i(i));
                return;
        }
    }
}
