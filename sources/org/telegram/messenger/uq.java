package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uq implements Runnable {
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
    public final qr f25736a;
    public final TLRPC.TL_messages_messages f25737b;
    public final int f25738c;
    public final long d;
    public final long f25739e;
    public final int f25740f;
    public final int h;
    public final int f25741n;
    public final int f25742r;
    public final int f25743s;
    public final int f25744w;
    public final int f25745x;
    public final int f25746y;

    public uq(qr qrVar, TLRPC.TL_messages_messages tL_messages_messages, int i3, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j12, int i20, boolean z11, int i21, boolean z12, boolean z13, sz szVar) {
        this.f25736a = qrVar;
        this.f25737b = tL_messages_messages;
        this.f25738c = i3;
        this.d = j10;
        this.f25739e = j11;
        this.f25740f = i10;
        this.h = i11;
        this.f25741n = i12;
        this.f25742r = i13;
        this.f25743s = i14;
        this.f25744w = i15;
        this.f25745x = i16;
        this.f25746y = i17;
        this.E = i18;
        this.F = z10;
        this.G = i19;
        this.H = j12;
        this.I = i20;
        this.J = z11;
        this.K = i21;
        this.L = z12;
        this.M = z13;
        this.N = szVar;
    }

    @Override
    public final void run() {
        this.f25736a.getMessagesController().K3(this.f25737b, this.f25738c, this.d, this.f25739e, this.f25740f, this.h, this.f25741n, true, this.f25742r, this.f25743s, this.f25744w, this.f25745x, this.f25746y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
