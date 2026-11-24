package defpackage;
public final class aq6 implements Runnable {
    public final hq6 a;
    public final long b;
    public final boolean c;
    public final int d;
    public final byte e;
    public final int f;
    public final long h;
    public final int n;

    public aq6(hq6 hq6Var, long j, boolean z, int i, int i2, int i3, long j2, int i4) {
        this.a = hq6Var;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = j2;
        this.n = i4;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        long j = this.b;
        boolean B = cf3.B(j);
        boolean z2 = this.c;
        int i2 = this.d;
        byte b = this.e;
        if (z2 && ((i2 == -1 || (i2 == 0 && b == 2)) && !B)) {
            z = true;
        } else {
            z = false;
        }
        hq6 hq6Var = this.a;
        long j2 = this.h;
        if (z || (this.f == 1 && !B)) {
            hq6Var.f0(b, this.n, j, j2, false);
        }
        if (!z) {
            if (!z2) {
                hq6Var.K1(b, i2, j, j2);
            }
            kk7 notificationCenter = hq6Var.getNotificationCenter();
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            if (z2 && i2 == -1) {
                i = 0;
            } else {
                i = i2;
            }
            notificationCenter.k(kk7.V, valueOf, valueOf2, Integer.valueOf(i), Boolean.valueOf(z2), Integer.valueOf(b));
        }
    }
}
