package org.telegram.messenger;
public final class qp implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final vr f26120a;
    public final wz f26121b;
    public final xz f26122c;
    public final long d;
    public final long f26123e;
    public final int f26124f;
    public final int h;
    public final int f26125n;
    public final int f26126r;
    public final int f26127s;
    public final int f26128w;
    public final int f26129x;
    public final long f26130y;

    public qp(vr vrVar, wz wzVar, xz xzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26120a = vrVar;
        this.f26121b = wzVar;
        this.f26122c = xzVar;
        this.d = j3;
        this.f26123e = j10;
        this.f26124f = i7;
        this.h = i10;
        this.f26125n = i11;
        this.f26126r = i12;
        this.f26127s = i13;
        this.f26128w = i14;
        this.f26129x = i15;
        this.f26130y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        vr vrVar = this.f26120a;
        wz wzVar = this.f26121b;
        xz xzVar = this.f26122c;
        long j3 = this.d;
        long j10 = this.f26123e;
        int i7 = this.f26124f;
        int i10 = this.h;
        int i11 = this.f26125n;
        int i12 = this.f26126r;
        int i13 = this.f26127s;
        int i14 = this.f26128w;
        int i15 = this.f26129x;
        long j11 = this.f26130y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        xz.a(wzVar);
        wz d = xz.d(xzVar, "MessagesStorage.getMessages");
        yq f02 = vrVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, xzVar);
        xz.a(d);
        Utilities.d.c(new fi(29, xz.d(xzVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
