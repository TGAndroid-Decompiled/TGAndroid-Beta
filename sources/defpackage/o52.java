package defpackage;
public final class o52 implements Runnable {
    public final byte a;
    public final k62 b;
    public final int c;

    public o52(k62 k62Var, int i, byte b) {
        this.a = b;
        this.b = k62Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.h0(i, null);
                return;
            case 1:
                k62Var.d0(i);
                return;
            default:
                k62Var.h0(i, null);
                return;
        }
    }
}
