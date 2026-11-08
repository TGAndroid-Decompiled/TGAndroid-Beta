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
    public final yr f21920a;
    public final TLRPC.TL_messages_messages f21921b;
    public final int f21922c;
    public final long d;
    public final long f21923e;
    public final int f21924f;
    public final int h;
    public final int f21925n;
    public final int f21926r;
    public final int f21927s;
    public final int f21928w;
    public final int f21929x;
    public final int f21930y;

    public cr(yr yrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z9, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, a00 a00Var) {
        this.f21920a = yrVar;
        this.f21921b = tL_messages_messages;
        this.f21922c = i7;
        this.d = j3;
        this.f21923e = j10;
        this.f21924f = i10;
        this.h = i11;
        this.f21925n = i12;
        this.f21926r = i13;
        this.f21927s = i14;
        this.f21928w = i15;
        this.f21929x = i16;
        this.f21930y = i17;
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
        this.f21920a.getMessagesController().K3(this.f21921b, this.f21922c, this.d, this.f21923e, this.f21924f, this.h, this.f21925n, true, this.f21926r, this.f21927s, this.f21928w, this.f21929x, this.f21930y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
