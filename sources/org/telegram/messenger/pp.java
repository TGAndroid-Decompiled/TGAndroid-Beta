package org.telegram.messenger;
public final class pp implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final ur f26332a;
    public final tz f26333b;
    public final uz f26334c;
    public final long d;
    public final long f26335e;
    public final int f26336f;
    public final int h;
    public final int f26337n;
    public final int f26338r;
    public final int f26339s;
    public final int f26340w;
    public final int f26341x;
    public final long f26342y;

    public pp(ur urVar, tz tzVar, uz uzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26332a = urVar;
        this.f26333b = tzVar;
        this.f26334c = uzVar;
        this.d = j3;
        this.f26335e = j10;
        this.f26336f = i7;
        this.h = i10;
        this.f26337n = i11;
        this.f26338r = i12;
        this.f26339s = i13;
        this.f26340w = i14;
        this.f26341x = i15;
        this.f26342y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        ur urVar = this.f26332a;
        tz tzVar = this.f26333b;
        uz uzVar = this.f26334c;
        long j3 = this.d;
        long j10 = this.f26335e;
        int i7 = this.f26336f;
        int i10 = this.h;
        int i11 = this.f26337n;
        int i12 = this.f26338r;
        int i13 = this.f26339s;
        int i14 = this.f26340w;
        int i15 = this.f26341x;
        long j11 = this.f26342y;
        int i16 = this.E;
        boolean z10 = this.F;
        boolean z11 = this.G;
        uz.a(tzVar);
        tz d = uz.d(uzVar, "MessagesStorage.getMessages");
        yq f02 = urVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z10, z11, uzVar);
        uz.a(d);
        Utilities.d.c(new sq(1, uz.d(uzVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
