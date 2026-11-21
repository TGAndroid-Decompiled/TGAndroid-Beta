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
    public final tr f27971a;
    public final TLRPC.TL_messages_messages f27972b;
    public final int f27973c;
    public final long d;
    public final long f27974e;
    public final int f27975f;
    public final int h;
    public final int f27976n;
    public final int f27977r;
    public final int f27978s;
    public final int f27979w;
    public final int f27980x;
    public final int f27981y;

    public xq(tr trVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, tz tzVar) {
        this.f27971a = trVar;
        this.f27972b = tL_messages_messages;
        this.f27973c = i7;
        this.d = j3;
        this.f27974e = j10;
        this.f27975f = i10;
        this.h = i11;
        this.f27976n = i12;
        this.f27977r = i13;
        this.f27978s = i14;
        this.f27979w = i15;
        this.f27980x = i16;
        this.f27981y = i17;
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
        this.f27971a.getMessagesController().R3(this.f27972b, this.f27973c, this.d, this.f27974e, this.f27975f, this.h, this.f27976n, true, this.f27977r, this.f27978s, this.f27979w, this.f27980x, this.f27981y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
