package org.telegram.messenger;
public final class ni implements Runnable {
    public final vi f17298a;
    public final long f17299b;
    public final boolean f17300c;
    public final int d;
    public final int e;
    public final int f17301f;
    public final long h;
    public final int f17302n;

    public ni(vi viVar, long j10, boolean z10, int i10, int i11, int i12, long j11, int i13) {
        this.f17298a = viVar;
        this.f17299b = j10;
        this.f17300c = z10;
        this.d = i10;
        this.e = i11;
        this.f17301f = i12;
        this.h = j11;
        this.f17302n = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        long j10;
        int i10;
        int i11;
        long j11 = this.f17299b;
        boolean C = o5.C(j11);
        boolean z11 = this.f17300c;
        int i12 = this.d;
        int i13 = this.e;
        if (z11 && ((i12 == -1 || (i12 == 0 && i13 == 2)) && !C)) {
            z10 = true;
        } else {
            z10 = false;
        }
        vi viVar = this.f17298a;
        long j12 = j11;
        int i14 = i13;
        long j13 = this.h;
        if (z10 || (this.f17301f == 1 && !C)) {
            viVar.d0(i14, this.f17302n, j12, j13, false);
        }
        if (!z10) {
            if (!z11) {
                i10 = i12;
                viVar.H1(j12, j13, i14, i10);
                j10 = j13;
                j12 = j12;
                i14 = i14;
            } else {
                j10 = j13;
                i10 = i12;
            }
            at notificationCenter = viVar.getNotificationCenter();
            Long valueOf = Long.valueOf(j12);
            Long valueOf2 = Long.valueOf(j10);
            if (z11 && i10 == -1) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            notificationCenter.k(at.W, valueOf, valueOf2, Integer.valueOf(i11), Boolean.valueOf(z11), Integer.valueOf(i14));
        }
    }
}
