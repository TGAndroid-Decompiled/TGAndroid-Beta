package org.telegram.messenger;
public final class op implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final tr f26086a;
    public final sz f26087b;
    public final tz f26088c;
    public final long d;
    public final long f26089e;
    public final int f26090f;
    public final int h;
    public final int f26091n;
    public final int f26092r;
    public final int f26093s;
    public final int f26094w;
    public final int f26095x;
    public final long f26096y;

    public op(tr trVar, sz szVar, tz tzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26086a = trVar;
        this.f26087b = szVar;
        this.f26088c = tzVar;
        this.d = j3;
        this.f26089e = j10;
        this.f26090f = i7;
        this.h = i10;
        this.f26091n = i11;
        this.f26092r = i12;
        this.f26093s = i13;
        this.f26094w = i14;
        this.f26095x = i15;
        this.f26096y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        tr trVar = this.f26086a;
        sz szVar = this.f26087b;
        tz tzVar = this.f26088c;
        long j3 = this.d;
        long j10 = this.f26089e;
        int i7 = this.f26090f;
        int i10 = this.h;
        int i11 = this.f26091n;
        int i12 = this.f26092r;
        int i13 = this.f26093s;
        int i14 = this.f26094w;
        int i15 = this.f26095x;
        long j11 = this.f26096y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        tz.a(szVar);
        sz d = tz.d(tzVar, "MessagesStorage.getMessages");
        xq f02 = trVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, tzVar);
        tz.a(d);
        Utilities.d.c(new rq(1, tz.d(tzVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
