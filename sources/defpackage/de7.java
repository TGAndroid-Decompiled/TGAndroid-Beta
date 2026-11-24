package defpackage;

import org.telegram.tgnet.TLRPC;
public final class de7 implements Runnable {
    public final int E;
    public final boolean F;
    public final int G;
    public final long H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final rqb N;
    public final cf7 a;
    public final TLRPC.TL_messages_messages b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    public de7(cf7 cf7Var, TLRPC.TL_messages_messages tL_messages_messages, int i, long j, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, long j3, int i12, boolean z2, int i13, boolean z3, boolean z4, rqb rqbVar) {
        this.a = cf7Var;
        this.b = tL_messages_messages;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.h = i3;
        this.n = i4;
        this.r = i5;
        this.s = i6;
        this.w = i7;
        this.x = i8;
        this.y = i9;
        this.E = i10;
        this.F = z;
        this.G = i11;
        this.H = j3;
        this.I = i12;
        this.J = z2;
        this.K = i13;
        this.L = z3;
        this.M = z4;
        this.N = rqbVar;
    }

    @Override
    public final void run() {
        this.a.getMessagesController().P3(this.b, this.c, this.d, this.e, this.f, this.h, this.n, true, this.r, this.s, this.w, this.x, this.y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
