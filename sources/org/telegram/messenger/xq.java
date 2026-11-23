package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xq implements Runnable {
    public final int E;
    public final boolean F;
    public final int G;
    public final long H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final sz N;
    public final tr f28059a;
    public final TLRPC.TL_messages_messages f28060b;
    public final int f28061c;
    public final long d;
    public final long f28062e;
    public final int f28063f;
    public final int h;
    public final int f28064n;
    public final int f28065r;
    public final int f28066s;
    public final int f28067w;
    public final int f28068x;
    public final int f28069y;

    public xq(tr trVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, sz szVar) {
        this.f28059a = trVar;
        this.f28060b = tL_messages_messages;
        this.f28061c = i7;
        this.d = j3;
        this.f28062e = j10;
        this.f28063f = i10;
        this.h = i11;
        this.f28064n = i12;
        this.f28065r = i13;
        this.f28066s = i14;
        this.f28067w = i15;
        this.f28068x = i16;
        this.f28069y = i17;
        this.E = i18;
        this.F = z10;
        this.G = i19;
        this.H = j11;
        this.I = i20;
        this.J = z11;
        this.K = i21;
        this.L = z12;
        this.M = z13;
        this.N = szVar;
    }

    @Override
    public final void run() {
        this.f28059a.getMessagesController().R3(this.f28060b, this.f28061c, this.d, this.f28062e, this.f28063f, this.h, this.f28064n, true, this.f28065r, this.f28066s, this.f28067w, this.f28068x, this.f28069y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
