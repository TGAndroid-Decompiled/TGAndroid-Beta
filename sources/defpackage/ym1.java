package defpackage;
public final class ym1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final long c;
    public final long d;

    public ym1(yv1 yv1Var, long j, long j2, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.s9(j2, j);
                return;
            default:
                yv1Var.U9(j2, j);
                return;
        }
    }
}
