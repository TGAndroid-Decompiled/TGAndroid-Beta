package org.telegram.messenger;
public final class ni implements Runnable {
    public final ui f24190a;
    public final long f24191b;
    public final boolean f24192c;
    public final int d;
    public final int f24193e;
    public final int f24194f;
    public final long h;
    public final int f24195n;

    public ni(ui uiVar, long j3, boolean z9, int i7, int i10, int i11, long j10, int i12) {
        this.f24190a = uiVar;
        this.f24191b = j3;
        this.f24192c = z9;
        this.d = i7;
        this.f24193e = i10;
        this.f24194f = i11;
        this.h = j10;
        this.f24195n = i12;
    }

    @Override
    public final void run() {
        boolean z9;
        long j3;
        int i7;
        int i10;
        long j10 = this.f24191b;
        boolean C = m5.C(j10);
        boolean z10 = this.f24192c;
        int i11 = this.d;
        int i12 = this.f24193e;
        if (z10 && ((i11 == -1 || (i11 == 0 && i12 == 2)) && !C)) {
            z9 = true;
        } else {
            z9 = false;
        }
        ui uiVar = this.f24190a;
        long j11 = j10;
        int i13 = i12;
        long j12 = this.h;
        if (z9 || (this.f24194f == 1 && !C)) {
            uiVar.d0(i13, this.f24195n, j11, j12, false);
        }
        if (!z9) {
            if (!z10) {
                i7 = i11;
                uiVar.H1(j11, j12, i13, i7);
                j3 = j12;
                j11 = j11;
                i13 = i13;
            } else {
                j3 = j12;
                i7 = i11;
            }
            qs notificationCenter = uiVar.getNotificationCenter();
            Long valueOf = Long.valueOf(j11);
            Long valueOf2 = Long.valueOf(j3);
            if (z10 && i7 == -1) {
                i10 = 0;
            } else {
                i10 = i7;
            }
            notificationCenter.k(qs.W, valueOf, valueOf2, Integer.valueOf(i10), Boolean.valueOf(z10), Integer.valueOf(i13));
        }
    }
}
