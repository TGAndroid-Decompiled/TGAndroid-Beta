package defpackage;
public final class hw2 extends ph0 {
    public final int F;
    public final long G;
    public final n41 H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public hw2(a83 a83Var, g83 g83Var, go4 go4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, n41 n41Var) {
        super(a83Var, g83Var, go4Var, i, obj, j, j2, j3, j4, j5);
        this.F = i2;
        this.G = j6;
        this.H = n41Var;
    }

    @Override
    public final void a() {
        boolean z;
        boolean z2;
        hr9[] hr9VarArr;
        long j;
        lx6 lx6Var = this.y;
        lx6Var.getClass();
        if (this.I == 0) {
            long j2 = this.G;
            for (hr9 hr9Var : (hr9[]) lx6Var.c) {
                if (hr9Var.I != j2) {
                    hr9Var.I = j2;
                    hr9Var.C = true;
                }
            }
            n41 n41Var = this.H;
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
            n41Var.b(lx6Var, j, j4);
        }
        try {
            g83 b = this.b.b(this.I);
            c0b c0bVar = this.r;
            vb3 vb3Var = new vb3(c0bVar, b.e, c0bVar.open(b));
            while (!this.J) {
                int b2 = this.H.a.b(vb3Var, n41.s);
                if (b2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                jte.p(z);
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
            go4 go4Var = this.d;
            String str = go4Var.s;
            int i = go4Var.V;
            int i2 = go4Var.W;
            if (wf7.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                yzb R = lx6Var.R(4);
                int i3 = i * i2;
                long j6 = (this.n - this.h) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    R.e(0, new yw7());
                    R.a(i4 * j6, 0, 0, 0, null);
                }
            }
            this.I = vb3Var.d - this.b.e;
            wde.a(this.r);
            this.K = !this.J;
        } catch (Throwable th) {
            wde.a(this.r);
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
    public final void e() {
        this.J = true;
    }
}
