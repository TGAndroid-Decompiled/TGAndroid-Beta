package org.telegram.messenger;
public final class wp implements Runnable {
    public final int D;
    public final boolean E;
    public final boolean F;
    public final yr f26346a;
    public final zz f26347b;
    public final a00 f26348c;
    public final long d;
    public final long f26349e;
    public final int f26350f;
    public final int h;
    public final int f26351n;
    public final int f26352r;
    public final int f26353s;
    public final int f26354w;
    public final int f26355x;
    public final long f26356y;

    public wp(yr yrVar, zz zzVar, a00 a00Var, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z9, boolean z10) {
        this.f26346a = yrVar;
        this.f26347b = zzVar;
        this.f26348c = a00Var;
        this.d = j3;
        this.f26349e = j10;
        this.f26350f = i7;
        this.h = i10;
        this.f26351n = i11;
        this.f26352r = i12;
        this.f26353s = i13;
        this.f26354w = i14;
        this.f26355x = i15;
        this.f26356y = j11;
        this.D = i16;
        this.E = z9;
        this.F = z10;
    }

    @Override
    public final void run() {
        yr yrVar = this.f26346a;
        zz zzVar = this.f26347b;
        a00 a00Var = this.f26348c;
        long j3 = this.d;
        long j10 = this.f26349e;
        int i7 = this.f26350f;
        int i10 = this.h;
        int i11 = this.f26351n;
        int i12 = this.f26352r;
        int i13 = this.f26353s;
        int i14 = this.f26354w;
        int i15 = this.f26355x;
        long j11 = this.f26356y;
        int i16 = this.D;
        boolean z9 = this.E;
        boolean z10 = this.F;
        a00.a(zzVar);
        zz d = a00.d(a00Var, "MessagesStorage.getMessages");
        cr f02 = yrVar.f0(j3, j10, i7, i10, i11, i12, i13, i14, i15, j11, i16, z9, z10, a00Var);
        a00.a(d);
        Utilities.d.c(new hi(28, a00.d(a00Var, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
