package org.telegram.messenger;
public final class mi implements Runnable {
    public final ui f16956a;
    public final long f16957b;
    public final boolean f16958c;
    public final int d;
    public final int e;
    public final int f16959f;
    public final long h;
    public final int f16960n;

    public mi(ui uiVar, long j10, boolean z10, int i10, int i11, int i12, long j11, int i13) {
        this.f16956a = uiVar;
        this.f16957b = j10;
        this.f16958c = z10;
        this.d = i10;
        this.e = i11;
        this.f16959f = i12;
        this.h = j11;
        this.f16960n = i13;
    }

    @Override
    public final void run() {
        boolean z10;
        long j10;
        int i10;
        int i11;
        long j11 = this.f16957b;
        boolean C = o5.C(j11);
        boolean z11 = this.f16958c;
        int i12 = this.d;
        int i13 = this.e;
        if (z11 && ((i12 == -1 || (i12 == 0 && i13 == 2)) && !C)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ui uiVar = this.f16956a;
        long j12 = j11;
        int i14 = i13;
        long j13 = this.h;
        if (z10 || (this.f16959f == 1 && !C)) {
            uiVar.d0(i14, this.f16960n, j12, j13, false);
        }
        if (!z10) {
            if (!z11) {
                i10 = i12;
                uiVar.H1(j12, j13, i14, i10);
                j10 = j13;
                j12 = j12;
                i14 = i14;
            } else {
                j10 = j13;
                i10 = i12;
            }
            zs notificationCenter = uiVar.getNotificationCenter();
            Long valueOf = Long.valueOf(j12);
            Long valueOf2 = Long.valueOf(j10);
            if (z11 && i10 == -1) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            notificationCenter.k(zs.W, valueOf, valueOf2, Integer.valueOf(i11), Boolean.valueOf(z11), Integer.valueOf(i14));
        }
    }
}
