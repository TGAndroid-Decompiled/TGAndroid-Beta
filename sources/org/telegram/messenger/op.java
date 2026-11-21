package org.telegram.messenger;
public final class op implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final tr f26114a;
    public final sz f26115b;
    public final tz f26116c;
    public final long d;
    public final long f26117e;
    public final int f26118f;
    public final int h;
    public final int f26119n;
    public final int f26120r;
    public final int f26121s;
    public final int f26122w;
    public final int f26123x;
    public final long f26124y;

    public op(tr trVar, sz szVar, tz tzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26114a = trVar;
        this.f26115b = szVar;
        this.f26116c = tzVar;
        this.d = j3;
        this.f26117e = j10;
        this.f26118f = i7;
        this.h = i10;
        this.f26119n = i11;
        this.f26120r = i12;
        this.f26121s = i13;
        this.f26122w = i14;
        this.f26123x = i15;
        this.f26124y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        tr trVar = this.f26114a;
        sz szVar = this.f26115b;
        tz tzVar = this.f26116c;
        long j3 = this.d;
        long j10 = this.f26117e;
        int i7 = this.f26118f;
        int i10 = this.h;
        int i11 = this.f26119n;
        int i12 = this.f26120r;
        int i13 = this.f26121s;
        int i14 = this.f26122w;
        int i15 = this.f26123x;
        long j11 = this.f26124y;
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
