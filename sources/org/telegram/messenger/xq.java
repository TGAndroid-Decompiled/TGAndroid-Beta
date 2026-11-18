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
    public final tr f27943a;
    public final TLRPC.TL_messages_messages f27944b;
    public final int f27945c;
    public final long d;
    public final long f27946e;
    public final int f27947f;
    public final int h;
    public final int f27948n;
    public final int f27949r;
    public final int f27950s;
    public final int f27951w;
    public final int f27952x;
    public final int f27953y;

    public xq(tr trVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, tz tzVar) {
        this.f27943a = trVar;
        this.f27944b = tL_messages_messages;
        this.f27945c = i7;
        this.d = j3;
        this.f27946e = j10;
        this.f27947f = i10;
        this.h = i11;
        this.f27948n = i12;
        this.f27949r = i13;
        this.f27950s = i14;
        this.f27951w = i15;
        this.f27952x = i16;
        this.f27953y = i17;
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
        this.f27943a.getMessagesController().R3(this.f27944b, this.f27945c, this.d, this.f27946e, this.f27947f, this.h, this.f27948n, true, this.f27949r, this.f27950s, this.f27951w, this.f27952x, this.f27953y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
