package org.telegram.messenger;
public final class cq implements Runnable {
    public final int D;
    public final boolean E;
    public final boolean F;
    public final is f15194a;
    public final l00 f15195b;
    public final m00 f15196c;
    public final long d;
    public final long e;
    public final int f15197f;
    public final int h;
    public final int f15198n;
    public final int f15199r;
    public final int f15200s;
    public final int f15201w;
    public final int f15202x;
    public final long f15203y;

    public cq(is isVar, l00 l00Var, m00 m00Var, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j12, int i17, boolean z10, boolean z11) {
        this.f15194a = isVar;
        this.f15195b = l00Var;
        this.f15196c = m00Var;
        this.d = j10;
        this.e = j11;
        this.f15197f = i10;
        this.h = i11;
        this.f15198n = i12;
        this.f15199r = i13;
        this.f15200s = i14;
        this.f15201w = i15;
        this.f15202x = i16;
        this.f15203y = j12;
        this.D = i17;
        this.E = z10;
        this.F = z11;
    }

    @Override
    public final void run() {
        is isVar = this.f15194a;
        l00 l00Var = this.f15195b;
        m00 m00Var = this.f15196c;
        long j10 = this.d;
        long j11 = this.e;
        int i10 = this.f15197f;
        int i11 = this.h;
        int i12 = this.f15198n;
        int i13 = this.f15199r;
        int i14 = this.f15200s;
        int i15 = this.f15201w;
        int i16 = this.f15202x;
        long j12 = this.f15203y;
        int i17 = this.D;
        boolean z10 = this.E;
        boolean z11 = this.F;
        m00.a(l00Var);
        l00 d = m00.d(m00Var, "MessagesStorage.getMessages");
        kr f02 = isVar.f0(j10, j11, i10, i11, i12, i13, i14, i15, i16, j12, i17, z10, z11, m00Var);
        m00.a(d);
        Utilities.d.c(new pi(27, m00.d(m00Var, "MessagesStorage.getMessages: stageQueue.postRunnable"), f02));
    }
}
