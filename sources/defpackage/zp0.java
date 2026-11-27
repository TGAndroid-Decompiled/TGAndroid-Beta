package defpackage;
public final class zp0 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final long c;
    public final long d;
    public final Object e;

    public zp0(long j, long j2, long j3, n82 n82Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = n82Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                bq0 bq0Var = (bq0) obj;
                long j = this.d;
                long j2 = this.b;
                long j3 = this.c;
                bq0Var.c(j2, j3, j, true);
                vye.c(bq0Var.currentAccount, j3);
                return;
            default:
                long j4 = this.b;
                long j5 = this.c;
                z61.l0 = Long.valueOf(j4 * j5);
                Long valueOf = Long.valueOf(this.d * j5);
                z61.m0 = valueOf;
                ((n82) obj).a(z61.l0, valueOf);
                return;
        }
    }

    public zp0(bq0 bq0Var, long j, long j2, long j3) {
        this.e = bq0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
