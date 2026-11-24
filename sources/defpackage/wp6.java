package defpackage;
public final class wp6 implements Runnable {
    public final byte a;
    public final hs6 b;
    public final long c;
    public final long d;
    public final int[] e;

    public wp6(hs6 hs6Var, long j, long j2, int[] iArr, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = j;
        this.d = j2;
        this.e = iArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int[] iArr = this.e;
        long j = this.d;
        long j2 = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
            case 1:
                hs6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
            default:
                hs6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
        }
    }
}
