package defpackage;

import org.telegram.messenger.Utilities;
public final class de7 implements Runnable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final kf7 a;
    public final psb b;
    public final qsb c;
    public final long d;
    public final long e;
    public final int f;
    public final int h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final long y;

    public de7(kf7 kf7Var, psb psbVar, qsb qsbVar, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j3, int i8, boolean z, boolean z2) {
        this.a = kf7Var;
        this.b = psbVar;
        this.c = qsbVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.h = i2;
        this.n = i3;
        this.r = i4;
        this.s = i5;
        this.w = i6;
        this.x = i7;
        this.y = j3;
        this.E = i8;
        this.F = z;
        this.G = z2;
    }

    @Override
    public final void run() {
        kf7 kf7Var = this.a;
        psb psbVar = this.b;
        qsb qsbVar = this.c;
        long j = this.d;
        long j2 = this.e;
        int i = this.f;
        int i2 = this.h;
        int i3 = this.n;
        int i4 = this.r;
        int i5 = this.s;
        int i6 = this.w;
        int i7 = this.x;
        long j3 = this.y;
        int i8 = this.E;
        boolean z = this.F;
        boolean z2 = this.G;
        qsb.a(psbVar);
        psb d = qsb.d(qsbVar, "MessagesStorage.getMessages");
        ne7 f0 = kf7Var.f0(j, j2, i, i2, i3, i4, i5, i6, i7, j3, i8, z, z2, qsbVar);
        qsb.a(d);
        Utilities.d.c(new t87(qsb.d(qsbVar, "MessagesStorage.getMessages: stageQueue.postRunnable"), f0, (byte) 19));
    }
}
