package org.telegram.messenger;
public final class op implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final tr f26088a;
    public final sz f26089b;
    public final tz f26090c;
    public final long d;
    public final long f26091e;
    public final int f26092f;
    public final int h;
    public final int f26093n;
    public final int f26094r;
    public final int f26095s;
    public final int f26096w;
    public final int f26097x;
    public final long f26098y;

    public op(tr trVar, sz szVar, tz tzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26088a = trVar;
        this.f26089b = szVar;
        this.f26090c = tzVar;
        this.d = j3;
        this.f26091e = j10;
        this.f26092f = i7;
        this.h = i10;
        this.f26093n = i11;
        this.f26094r = i12;
        this.f26095s = i13;
        this.f26096w = i14;
        this.f26097x = i15;
        this.f26098y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        tr trVar = this.f26088a;
        sz szVar = this.f26089b;
        tz tzVar = this.f26090c;
        long j3 = this.d;
        long j10 = this.f26091e;
        int i7 = this.f26092f;
        int i10 = this.h;
        int i11 = this.f26093n;
        int i12 = this.f26094r;
        int i13 = this.f26095s;
        int i14 = this.f26096w;
        int i15 = this.f26097x;
        long j11 = this.f26098y;
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
