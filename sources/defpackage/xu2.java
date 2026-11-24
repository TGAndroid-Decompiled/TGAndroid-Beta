package defpackage;
public final class xu2 extends og0 {
    public final int F;
    public final long G;
    public final f31 H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public xu2(o63 o63Var, u63 u63Var, fm4 fm4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, f31 f31Var) {
        super(o63Var, u63Var, fm4Var, i, obj, j, j2, j3, j4, j5);
        this.F = i2;
        this.G = j6;
        this.H = f31Var;
    }

    @Override
    public final void a() {
        boolean z;
        boolean z2;
        gp9[] gp9VarArr;
        long j;
        tg2 tg2Var = this.y;
        tg2Var.getClass();
        if (this.I == 0) {
            long j2 = this.G;
            for (gp9 gp9Var : (gp9[]) tg2Var.c) {
                if (gp9Var.I != j2) {
                    gp9Var.I = j2;
                    gp9Var.C = true;
                }
            }
            f31 f31Var = this.H;
            long j3 = this.w;
            long j4 = -9223372036854775807L;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.G;
            }
            long j5 = this.x;
            if (j5 != -9223372036854775807L) {
                j4 = j5 - this.G;
            }
            f31Var.b(tg2Var, j, j4);
        }
        try {
            u63 b = this.b.b(this.I);
            zxa zxaVar = this.r;
            ja3 ja3Var = new ja3(zxaVar, b.e, zxaVar.open(b));
            while (!this.J) {
                int b2 = this.H.a.b(ja3Var, f31.s);
                if (b2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                gre.p(z);
                if (b2 == 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    break;
                }
            }
            fm4 fm4Var = this.d;
            String str = fm4Var.s;
            int i = fm4Var.V;
            int i2 = fm4Var.W;
            if (ud7.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                wxb b0 = tg2Var.b0(4);
                int i3 = i * i2;
                long j6 = (this.n - this.h) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    b0.e(0, new xu7());
                    b0.a(i4 * j6, 0, 0, 0, null);
                }
            }
            this.I = ja3Var.d - this.b.e;
            vbe.a(this.r);
            this.K = !this.J;
        } catch (Throwable th) {
            vbe.a(this.r);
            throw th;
        }
    }

    @Override
    public final long b() {
        return this.s + this.F;
    }

    @Override
    public final boolean c() {
        return this.K;
    }

    @Override
    public final void d() {
        this.J = true;
    }
}
