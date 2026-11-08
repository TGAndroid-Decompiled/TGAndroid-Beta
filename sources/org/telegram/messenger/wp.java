package org.telegram.messenger;
public final class wp implements Runnable {
    public final int D;
    public final boolean E;
    public final boolean F;
    public final yr f26352a;
    public final zz f26353b;
    public final a00 f26354c;
    public final long d;
    public final long f26355e;
    public final int f26356f;
    public final int h;
    public final int f26357n;
    public final int f26358r;
    public final int f26359s;
    public final int f26360w;
    public final int f26361x;
    public final long f26362y;

    public wp(yr yrVar, zz zzVar, a00 a00Var, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z9, boolean z10) {
        this.f26352a = yrVar;
        this.f26353b = zzVar;
        this.f26354c = a00Var;
        this.d = j3;
        this.f26355e = j10;
        this.f26356f = i7;
        this.h = i10;
        this.f26357n = i11;
        this.f26358r = i12;
        this.f26359s = i13;
        this.f26360w = i14;
        this.f26361x = i15;
        this.f26362y = j11;
        this.D = i16;
        this.E = z9;
        this.F = z10;
    }

    @Override
    public final void run() {
        yr yrVar = this.f26352a;
        zz zzVar = this.f26353b;
        a00 a00Var = this.f26354c;
        long j3 = this.d;
        long j10 = this.f26355e;
        int i7 = this.f26356f;
        int i10 = this.h;
        int i11 = this.f26357n;
        int i12 = this.f26358r;
        int i13 = this.f26359s;
        int i14 = this.f26360w;
        int i15 = this.f26361x;
        long j11 = this.f26362y;
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
