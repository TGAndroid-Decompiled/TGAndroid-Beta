package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cr implements Runnable {
    public final int D;
    public final boolean E;
    public final int F;
    public final long G;
    public final int H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final a00 M;
    public final yr f21891a;
    public final TLRPC.TL_messages_messages f21892b;
    public final int f21893c;
    public final long d;
    public final long f21894e;
    public final int f21895f;
    public final int h;
    public final int f21896n;
    public final int f21897r;
    public final int f21898s;
    public final int f21899w;
    public final int f21900x;
    public final int f21901y;

    public cr(yr yrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z9, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, a00 a00Var) {
        this.f21891a = yrVar;
        this.f21892b = tL_messages_messages;
        this.f21893c = i7;
        this.d = j3;
        this.f21894e = j10;
        this.f21895f = i10;
        this.h = i11;
        this.f21896n = i12;
        this.f21897r = i13;
        this.f21898s = i14;
        this.f21899w = i15;
        this.f21900x = i16;
        this.f21901y = i17;
        this.D = i18;
        this.E = z9;
        this.F = i19;
        this.G = j11;
        this.H = i20;
        this.I = z10;
        this.J = i21;
        this.K = z11;
        this.L = z12;
        this.M = a00Var;
    }

    @Override
    public final void run() {
        this.f21891a.getMessagesController().K3(this.f21892b, this.f21893c, this.d, this.f21894e, this.f21895f, this.h, this.f21896n, true, this.f21897r, this.f21898s, this.f21899w, this.f21900x, this.f21901y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
