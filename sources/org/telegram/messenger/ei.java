package org.telegram.messenger;
public final class ei implements Runnable {
    public final li f22355a;
    public final long f22356b;
    public final boolean f22357c;
    public final int d;
    public final int f22358e;
    public final int f22359f;
    public final long h;
    public final int f22360n;

    public ei(li liVar, long j10, boolean z10, int i3, int i10, int i11, long j11, int i12) {
        this.f22355a = liVar;
        this.f22356b = j10;
        this.f22357c = z10;
        this.d = i3;
        this.f22358e = i10;
        this.f22359f = i11;
        this.h = j11;
        this.f22360n = i12;
    }

    @Override
    public final void run() {
        boolean z10;
        long j10;
        int i3;
        int i10;
        long j11 = this.f22356b;
        boolean C = m5.C(j11);
        boolean z11 = this.f22357c;
        int i11 = this.d;
        int i12 = this.f22358e;
        if (z11 && ((i11 == -1 || (i11 == 0 && i12 == 2)) && !C)) {
            z10 = true;
        } else {
            z10 = false;
        }
        li liVar = this.f22355a;
        long j12 = j11;
        int i13 = i12;
        long j13 = this.h;
        if (z10 || (this.f22359f == 1 && !C)) {
            liVar.d0(i13, this.f22360n, j12, j13, false);
        }
        if (!z10) {
            if (!z11) {
                i3 = i11;
                liVar.H1(j12, j13, i13, i3);
                j10 = j13;
                j12 = j12;
                i13 = i13;
            } else {
                j10 = j13;
                i3 = i11;
            }
            hs notificationCenter = liVar.getNotificationCenter();
            Long valueOf = Long.valueOf(j12);
            Long valueOf2 = Long.valueOf(j10);
            if (z11 && i3 == -1) {
                i10 = 0;
            } else {
                i10 = i3;
            }
            notificationCenter.k(hs.W, valueOf, valueOf2, Integer.valueOf(i10), Boolean.valueOf(z11), Integer.valueOf(i13));
        }
    }
}
