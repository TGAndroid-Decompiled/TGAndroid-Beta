package defpackage;
public final class np6 implements Runnable {
    public final byte a;
    public final ls6 b;
    public final long c;
    public final long d;
    public final int[] e;

    public np6(ls6 ls6Var, long j, long j2, int[] iArr, byte b) {
        this.a = b;
        this.b = ls6Var;
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
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
            case 1:
                ls6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
            default:
                ls6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
        }
    }
}
