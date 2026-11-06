package org.telegram.messenger;
public final class wp implements Runnable {
    public final int D;
    public final boolean E;
    public final boolean F;
    public final yr f26338a;
    public final zz f26339b;
    public final a00 f26340c;
    public final long d;
    public final long f26341e;
    public final int f26342f;
    public final int h;
    public final int f26343n;
    public final int f26344r;
    public final int f26345s;
    public final int f26346w;
    public final int f26347x;
    public final long f26348y;

    public wp(yr yrVar, zz zzVar, a00 a00Var, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z9, boolean z10) {
        this.f26338a = yrVar;
        this.f26339b = zzVar;
        this.f26340c = a00Var;
        this.d = j3;
        this.f26341e = j10;
        this.f26342f = i7;
        this.h = i10;
        this.f26343n = i11;
        this.f26344r = i12;
        this.f26345s = i13;
        this.f26346w = i14;
        this.f26347x = i15;
        this.f26348y = j11;
        this.D = i16;
        this.E = z9;
        this.F = z10;
    }

    @Override
    public final void run() {
        yr yrVar = this.f26338a;
        zz zzVar = this.f26339b;
        a00 a00Var = this.f26340c;
        long j3 = this.d;
        long j10 = this.f26341e;
        int i7 = this.f26342f;
        int i10 = this.h;
        int i11 = this.f26343n;
        int i12 = this.f26344r;
        int i13 = this.f26345s;
        int i14 = this.f26346w;
        int i15 = this.f26347x;
        long j11 = this.f26348y;
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
