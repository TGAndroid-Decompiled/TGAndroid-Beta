package defpackage;
public final class vn6 implements Runnable {
    public final byte a;
    public final hq6 b;
    public final long c;
    public final long d;
    public final int[] e;

    public vn6(hq6 hq6Var, long j, long j2, int[] iArr, byte b) {
        this.a = b;
        this.b = hq6Var;
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
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.getNotificationCenter().k(34, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
            case 1:
                hq6Var.getNotificationCenter().k(34, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
            default:
                hq6Var.getNotificationCenter().k(34, Long.valueOf(j2), Long.valueOf(j), iArr);
                return;
        }
    }
}
