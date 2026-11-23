package org.telegram.messenger;
public final class pp implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final ur f26296a;
    public final tz f26297b;
    public final uz f26298c;
    public final long d;
    public final long f26299e;
    public final int f26300f;
    public final int h;
    public final int f26301n;
    public final int f26302r;
    public final int f26303s;
    public final int f26304w;
    public final int f26305x;
    public final long f26306y;

    public pp(ur urVar, tz tzVar, uz uzVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, boolean z11) {
        this.f26296a = urVar;
        this.f26297b = tzVar;
        this.f26298c = uzVar;
        this.d = j3;
        this.f26299e = j10;
        this.f26300f = i7;
        this.h = i10;
        this.f26301n = i11;
        this.f26302r = i12;
        this.f26303s = i13;
        this.f26304w = i14;
        this.f26305x = i15;
        this.f26306y = j11;
        this.E = i16;
        this.F = z10;
        this.G = z11;
    }

    @Override
    public final void run() {
        ur urVar = this.f26296a;
        tz tzVar = this.f26297b;
        uz uzVar = this.f26298c;
        long j3 = this.d;
        long j10 = this.f26299e;
        int i7 = this.f26300f;
        int i10 = this.h;
        int i11 = this.f26301n;
        int i12 = this.f26302r;
        int i13 = this.f26303s;
        int i14 = this.f26304w;
        int i15 = this.f26305x;
        long j11 = this.f26306y;
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
