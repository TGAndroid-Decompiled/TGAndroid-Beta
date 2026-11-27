package defpackage;
public final class dv8 implements Runnable {
    public final byte a;
    public final gv8 b;
    public final int c;

    public dv8(gv8 gv8Var, int i, byte b) {
        this.a = b;
        this.b = gv8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        gv8 gv8Var = this.b;
        switch (b) {
            case 0:
                gv8Var.b.e(i, gv8Var.d.i(i));
                return;
            default:
                gv8Var.b.e(i, gv8Var.d.i(i));
                return;
        }
    }
}
