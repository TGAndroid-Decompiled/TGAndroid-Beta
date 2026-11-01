package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kr implements Runnable {
    public final int D;
    public final boolean E;
    public final int F;
    public final long G;
    public final int H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final m00 M;
    public final is f16772a;
    public final TLRPC.TL_messages_messages f16773b;
    public final int f16774c;
    public final long d;
    public final long e;
    public final int f16775f;
    public final int h;
    public final int f16776n;
    public final int f16777r;
    public final int f16778s;
    public final int f16779w;
    public final int f16780x;
    public final int f16781y;

    public kr(is isVar, TLRPC.TL_messages_messages tL_messages_messages, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, int i20, long j12, int i21, boolean z11, int i22, boolean z12, boolean z13, m00 m00Var) {
        this.f16772a = isVar;
        this.f16773b = tL_messages_messages;
        this.f16774c = i10;
        this.d = j10;
        this.e = j11;
        this.f16775f = i11;
        this.h = i12;
        this.f16776n = i13;
        this.f16777r = i14;
        this.f16778s = i15;
        this.f16779w = i16;
        this.f16780x = i17;
        this.f16781y = i18;
        this.D = i19;
        this.E = z10;
        this.F = i20;
        this.G = j12;
        this.H = i21;
        this.I = z11;
        this.J = i22;
        this.K = z12;
        this.L = z13;
        this.M = m00Var;
    }

    @Override
    public final void run() {
        this.f16772a.getMessagesController().H3(this.f16773b, this.f16774c, this.d, this.e, this.f16775f, this.h, this.f16776n, true, this.f16777r, this.f16778s, this.f16779w, this.f16780x, this.f16781y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }
}
