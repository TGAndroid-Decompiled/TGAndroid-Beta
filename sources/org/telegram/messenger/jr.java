package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jr implements Runnable {
    public final int D;
    public final boolean E;
    public final int F;
    public final long G;
    public final int H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final l00 M;
    public final hs f16419a;
    public final TLRPC.TL_messages_messages f16420b;
    public final int f16421c;
    public final long d;
    public final long e;
    public final int f16422f;
    public final int h;
    public final int f16423n;
    public final int f16424r;
    public final int f16425s;
    public final int f16426w;
    public final int f16427x;
    public final int f16428y;

    public jr(hs hsVar, TLRPC.TL_messages_messages tL_messages_messages, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, int i20, long j12, int i21, boolean z11, int i22, boolean z12, boolean z13, l00 l00Var) {
        this.f16419a = hsVar;
        this.f16420b = tL_messages_messages;
        this.f16421c = i10;
        this.d = j10;
        this.e = j11;
        this.f16422f = i11;
        this.h = i12;
        this.f16423n = i13;
        this.f16424r = i14;
        this.f16425s = i15;
        this.f16426w = i16;
        this.f16427x = i17;
        this.f16428y = i18;
        this.D = i19;
        this.E = z10;
        this.F = i20;
        this.G = j12;
        this.H = i21;
        this.I = z11;
        this.J = i22;
        this.K = z12;
        this.L = z13;
        this.M = l00Var;
    }

    @Override
    public final void run() {
        this.f16419a.getMessagesController().H3(this.f16420b, this.f16421c, this.d, this.e, this.f16422f, this.h, this.f16423n, true, this.f16424r, this.f16425s, this.f16426w, this.f16427x, this.f16428y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
