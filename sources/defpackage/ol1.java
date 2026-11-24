package defpackage;
public final class ol1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final long c;
    public final long d;

    public ol1(mu1 mu1Var, long j, long j2, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.g9(j2, j);
                return;
            default:
                mu1Var.I9(j2, j);
                return;
        }
    }
}
