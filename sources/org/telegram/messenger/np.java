package org.telegram.messenger;
public final class np implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final qr f24411a;
    public final rz f24412b;
    public final sz f24413c;
    public final long d;
    public final long f24414e;
    public final int f24415f;
    public final int h;
    public final int f24416n;
    public final int f24417r;
    public final int f24418s;
    public final int f24419w;
    public final int f24420x;
    public final long f24421y;

    public np(qr qrVar, rz rzVar, sz szVar, long j10, long j11, int i3, int i10, int i11, int i12, int i13, int i14, int i15, long j12, int i16, boolean z10, boolean z11) {
        this.f24411a = qrVar;
        this.f24412b = rzVar;
        this.f24413c = szVar;
        this.d = j10;
        this.f24414e = j11;
        this.f24415f = i3;
        this.h = i10;
        this.f24416n = i11;
        this.f24417r = i12;
        this.f24418s = i13;
        this.f24419w = i14;
        this.f24420x = i15;
        this.f24421y = j12;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        qr qrVar = this.f24411a;
        rz rzVar = this.f24412b;
        sz szVar = this.f24413c;
        long j10 = this.d;
        long j11 = this.f24414e;
        int i3 = this.f24415f;
        int i10 = this.h;
        int i11 = this.f24416n;
        int i12 = this.f24417r;
        int i13 = this.f24418s;
        int i14 = this.f24419w;
        int i15 = this.f24420x;
        long j12 = this.f24421y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        sz.a(rzVar);
        rz d = sz.d(szVar, "MessagesStorage.getMessages");
        uq f02 = qrVar.f0(j10, j11, i3, i10, i11, i12, i13, i14, i15, j12, i16, z10, z11, szVar);
        sz.a(d);
        Utilities.d.c(new yh(28, sz.d(szVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
