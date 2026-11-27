package defpackage;
public final class e62 implements Runnable {
    public final byte a;
    public final a72 b;
    public final int c;

    public e62(a72 a72Var, int i, byte b) {
        this.a = b;
        this.b = a72Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.g0(i, null);
                return;
            case 1:
                a72Var.c0(i);
                return;
            default:
                a72Var.g0(i, null);
                return;
        }
    }
}
