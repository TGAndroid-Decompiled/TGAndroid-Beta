package defpackage;
public final class rc2 implements Runnable {
    public final byte a;
    public final zc2 b;
    public final long c;

    public rc2(zc2 zc2Var, long j, byte b) {
        this.a = b;
        this.b = zc2Var;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        zc2 zc2Var = this.b;
        switch (b) {
            case 0:
                zc2Var.n = j;
                zc2Var.r = true;
                zc2Var.c0();
                return;
            default:
                zc2Var.h0(j);
                return;
        }
    }
}
