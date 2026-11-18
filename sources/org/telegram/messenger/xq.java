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
    public final tz N;
    public final tr f27945a;
    public final TLRPC.TL_messages_messages f27946b;
    public final int f27947c;
    public final long d;
    public final long f27948e;
    public final int f27949f;
    public final int h;
    public final int f27950n;
    public final int f27951r;
    public final int f27952s;
    public final int f27953w;
    public final int f27954x;
    public final int f27955y;

    public xq(tr trVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, tz tzVar) {
        this.f27945a = trVar;
        this.f27946b = tL_messages_messages;
        this.f27947c = i7;
        this.d = j3;
        this.f27948e = j10;
        this.f27949f = i10;
        this.h = i11;
        this.f27950n = i12;
        this.f27951r = i13;
        this.f27952s = i14;
        this.f27953w = i15;
        this.f27954x = i16;
        this.f27955y = i17;
        this.E = i18;
        this.F = z10;
        this.G = i19;
        this.H = j11;
        this.I = i20;
        this.J = z11;
        this.K = i21;
        this.L = z12;
        this.M = z13;
        this.N = tzVar;
    }

    @Override
    public final void run() {
        this.f27945a.getMessagesController().R3(this.f27946b, this.f27947c, this.d, this.f27948e, this.f27949f, this.h, this.f27950n, true, this.f27951r, this.f27952s, this.f27953w, this.f27954x, this.f27955y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
