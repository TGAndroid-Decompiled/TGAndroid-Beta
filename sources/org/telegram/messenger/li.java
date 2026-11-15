package org.telegram.messenger;
public final class li implements Runnable {
    public final si f24832a;
    public final long f24833b;
    public final boolean f24834c;
    public final int d;
    public final int f24835e;
    public final int f24836f;
    public final long h;
    public final int f24837n;

    public li(si siVar, long j3, boolean z10, int i7, int i10, int i11, long j10, int i12) {
        this.f24832a = siVar;
        this.f24833b = j3;
        this.f24834c = z10;
        this.d = i7;
        this.f24835e = i10;
        this.f24836f = i11;
        this.h = j10;
        this.f24837n = i12;
    }

    @Override
    public final void run() {
        boolean z10;
        long j3;
        int i7;
        int i10;
        long j10 = this.f24833b;
        boolean C = m5.C(j10);
        boolean z11 = this.f24834c;
        int i11 = this.d;
        int i12 = this.f24835e;
        if (z11 && ((i11 == -1 || (i11 == 0 && i12 == 2)) && !C)) {
            z10 = true;
        } else {
            z10 = false;
        }
        si siVar = this.f24832a;
        long j11 = j10;
        int i13 = i12;
        long j12 = this.h;
        if (z10 || (this.f24836f == 1 && !C)) {
            siVar.d0(i13, this.f24837n, j11, j12, false);
        }
        if (!z10) {
            if (!z11) {
                i7 = i11;
                siVar.H1(j11, j12, i13, i7);
                j3 = j12;
                j11 = j11;
                i13 = i13;
            } else {
                j3 = j12;
                i7 = i11;
            }
            ns notificationCenter = siVar.getNotificationCenter();
            Long valueOf = Long.valueOf(j11);
            Long valueOf2 = Long.valueOf(j3);
            if (z11 && i7 == -1) {
                i10 = 0;
            } else {
                i10 = i7;
            }
            notificationCenter.k(ns.W, valueOf, valueOf2, Integer.valueOf(i10), Boolean.valueOf(z11), Integer.valueOf(i13));
        }
    }
}
