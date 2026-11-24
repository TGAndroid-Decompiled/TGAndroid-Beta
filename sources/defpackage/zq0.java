package defpackage;
public final class zq0 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final long c;
    public final long d;
    public final Object e;

    public zq0(long j, long j2, long j3, h92 h92Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = h92Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                br0 br0Var = (br0) obj;
                long j = this.d;
                long j2 = this.b;
                long j3 = this.c;
                br0Var.c(j2, j3, j, true);
                ewe.c(br0Var.currentAccount, j3);
                return;
            default:
                long j4 = this.b;
                long j5 = this.c;
                y71.l0 = Long.valueOf(j4 * j5);
                Long valueOf = Long.valueOf(this.d * j5);
                y71.m0 = valueOf;
                ((h92) obj).a(y71.l0, valueOf);
                return;
        }
    }

    public zq0(br0 br0Var, long j, long j2, long j3) {
        this.e = br0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
