package org.telegram.messenger;
public final class bq implements Runnable {
    public final int D;
    public final boolean E;
    public final boolean F;
    public final hs f14811a;
    public final k00 f14812b;
    public final l00 f14813c;
    public final long d;
    public final long e;
    public final int f14814f;
    public final int h;
    public final int f14815n;
    public final int f14816r;
    public final int f14817s;
    public final int f14818w;
    public final int f14819x;
    public final long f14820y;

    public bq(hs hsVar, k00 k00Var, l00 l00Var, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j12, int i17, boolean z10, boolean z11) {
        this.f14811a = hsVar;
        this.f14812b = k00Var;
        this.f14813c = l00Var;
        this.d = j10;
        this.e = j11;
        this.f14814f = i10;
        this.h = i11;
        this.f14815n = i12;
        this.f14816r = i13;
        this.f14817s = i14;
        this.f14818w = i15;
        this.f14819x = i16;
        this.f14820y = j12;
        this.D = i17;
        this.E = z10;
        this.F = z11;
    }

    @Override
    public final void run() {
        hs hsVar = this.f14811a;
        k00 k00Var = this.f14812b;
        l00 l00Var = this.f14813c;
        long j10 = this.d;
        long j11 = this.e;
        int i10 = this.f14814f;
        int i11 = this.h;
        int i12 = this.f14815n;
        int i13 = this.f14816r;
        int i14 = this.f14817s;
        int i15 = this.f14818w;
        int i16 = this.f14819x;
        long j12 = this.f14820y;
        int i17 = this.D;
        boolean z10 = this.E;
        boolean z11 = this.F;
        l00.a(k00Var);
        k00 d = l00.d(l00Var, "MessagesStorage.getMessages");
        jr f02 = hsVar.f0(j10, j11, i10, i11, i12, i13, i14, i15, i16, j12, i17, z10, z11, l00Var);
        l00.a(d);
        Utilities.d.c(new oi(27, l00.d(l00Var, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
