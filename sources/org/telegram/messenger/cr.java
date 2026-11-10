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
    public final yr f21924a;
    public final TLRPC.TL_messages_messages f21925b;
    public final int f21926c;
    public final long d;
    public final long f21927e;
    public final int f21928f;
    public final int h;
    public final int f21929n;
    public final int f21930r;
    public final int f21931s;
    public final int f21932w;
    public final int f21933x;
    public final int f21934y;

    public cr(yr yrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z9, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, a00 a00Var) {
        this.f21924a = yrVar;
        this.f21925b = tL_messages_messages;
        this.f21926c = i7;
        this.d = j3;
        this.f21927e = j10;
        this.f21928f = i10;
        this.h = i11;
        this.f21929n = i12;
        this.f21930r = i13;
        this.f21931s = i14;
        this.f21932w = i15;
        this.f21933x = i16;
        this.f21934y = i17;
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
        this.f21924a.getMessagesController().K3(this.f21925b, this.f21926c, this.d, this.f21927e, this.f21928f, this.h, this.f21929n, true, this.f21930r, this.f21931s, this.f21932w, this.f21933x, this.f21934y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
