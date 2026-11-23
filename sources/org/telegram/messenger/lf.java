package org.telegram.messenger;
public final class lf implements Runnable {
    public final ri f25486a;
    public final long f25487b;
    public final boolean f25488c;
    public final int d;
    public final int f25489e;
    public final int f25490f;
    public final long h;
    public final int f25491n;

    public lf(ri riVar, long j3, boolean z10, int i7, int i10, int i11, long j10, int i12) {
        this.f25486a = riVar;
        this.f25487b = j3;
        this.f25488c = z10;
        this.d = i7;
        this.f25489e = i10;
        this.f25490f = i11;
        this.h = j10;
        this.f25491n = i12;
    }

    @Override
    public final void run() {
        boolean z10;
        long j3;
        int i7;
        int i10;
        long j10 = this.f25487b;
        boolean C = n5.C(j10);
        boolean z11 = this.f25488c;
        int i11 = this.d;
        int i12 = this.f25489e;
        if (z11 && ((i11 == -1 || (i11 == 0 && i12 == 2)) && !C)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ri riVar = this.f25486a;
        long j11 = j10;
        int i13 = i12;
        long j12 = this.h;
        if (z10 || (this.f25490f == 1 && !C)) {
            riVar.f0(i13, this.f25491n, j11, j12, false);
        }
        if (!z10) {
            if (!z11) {
                i7 = i11;
                riVar.M1(j11, j12, i13, i7);
                j3 = j12;
                j11 = j11;
                i13 = i13;
            } else {
                j3 = j12;
                i7 = i11;
            }
            ks notificationCenter = riVar.getNotificationCenter();
            Long valueOf = Long.valueOf(j11);
            Long valueOf2 = Long.valueOf(j3);
            if (z11 && i7 == -1) {
                i10 = 0;
            } else {
                i10 = i7;
            }
            notificationCenter.k(ks.W, valueOf, valueOf2, Integer.valueOf(i10), Boolean.valueOf(z11), Integer.valueOf(i13));
        }
    }
}
