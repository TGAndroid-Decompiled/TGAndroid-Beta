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
    public final yr f21885a;
    public final TLRPC.TL_messages_messages f21886b;
    public final int f21887c;
    public final long d;
    public final long f21888e;
    public final int f21889f;
    public final int h;
    public final int f21890n;
    public final int f21891r;
    public final int f21892s;
    public final int f21893w;
    public final int f21894x;
    public final int f21895y;

    public cr(yr yrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z9, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, a00 a00Var) {
        this.f21885a = yrVar;
        this.f21886b = tL_messages_messages;
        this.f21887c = i7;
        this.d = j3;
        this.f21888e = j10;
        this.f21889f = i10;
        this.h = i11;
        this.f21890n = i12;
        this.f21891r = i13;
        this.f21892s = i14;
        this.f21893w = i15;
        this.f21894x = i16;
        this.f21895y = i17;
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
        this.f21885a.getMessagesController().K3(this.f21886b, this.f21887c, this.d, this.f21888e, this.f21889f, this.h, this.f21890n, true, this.f21891r, this.f21892s, this.f21893w, this.f21894x, this.f21895y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
