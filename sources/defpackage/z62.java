package defpackage;
public final class z62 implements Runnable {
    public final byte a;
    public final v72 b;
    public final int c;

    public z62(v72 v72Var, int i, byte b) {
        this.a = b;
        this.b = v72Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.h0(i, null);
                return;
            case 1:
                v72Var.d0(i);
                return;
            default:
                v72Var.h0(i, null);
                return;
        }
    }
}
