package org.telegram.messenger;
public final class op implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final tr f26183a;
    public final rz f26184b;
    public final sz f26185c;
    public final long d;
    public final long f26186e;
    public final int f26187f;
    public final int h;
    public final int f26188n;
    public final int f26189r;
    public final int f26190s;
    public final int f26191w;
    public final int f26192x;
    public final long f26193y;

    public op(tr trVar, rz rzVar, sz szVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26183a = trVar;
        this.f26184b = rzVar;
        this.f26185c = szVar;
        this.d = j3;
        this.f26186e = j10;
        this.f26187f = i7;
        this.h = i10;
        this.f26188n = i11;
        this.f26189r = i12;
        this.f26190s = i13;
        this.f26191w = i14;
        this.f26192x = i15;
        this.f26193y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        tr trVar = this.f26183a;
        rz rzVar = this.f26184b;
        sz szVar = this.f26185c;
        long j3 = this.d;
        long j10 = this.f26186e;
        int i7 = this.f26187f;
        int i10 = this.h;
        int i11 = this.f26188n;
        int i12 = this.f26189r;
        int i13 = this.f26190s;
        int i14 = this.f26191w;
        int i15 = this.f26192x;
        long j11 = this.f26193y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        sz.a(rzVar);
        rz d = sz.d(szVar, "MessagesStorage.getMessages");
        xq f02 = trVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, szVar);
        sz.a(d);
        Utilities.d.c(new rq(1, sz.d(szVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
