package defpackage;
public final class rv2 extends pg0 {
    public final int F;
    public final long G;
    public final o31 H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public rv2(h73 h73Var, n73 n73Var, ko4 ko4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, o31 o31Var) {
        super(h73Var, n73Var, ko4Var, i, obj, j, j2, j3, j4, j5);
        this.F = i2;
        this.G = j6;
        this.H = o31Var;
    }

    @Override
    public final void a() {
        boolean z;
        boolean z2;
        ys9[] ys9VarArr;
        long j;
        lh2 lh2Var = this.y;
        lh2Var.getClass();
        if (this.I == 0) {
            long j2 = this.G;
            for (ys9 ys9Var : (ys9[]) lh2Var.c) {
                if (ys9Var.I != j2) {
                    ys9Var.I = j2;
                    ys9Var.C = true;
                }
            }
            o31 o31Var = this.H;
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
            o31Var.b(lh2Var, j, j4);
        }
        try {
            n73 b = this.b.b(this.I);
            b2b b2bVar = this.r;
            cb3 cb3Var = new cb3(b2bVar, b.e, b2bVar.open(b));
            while (!this.J) {
                int b2 = this.H.a.b(cb3Var, o31.s);
                if (b2 != 1) {
                    z = true;
                } else {
                    z = false;
                }
                yve.p(z);
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
            ko4 ko4Var = this.d;
            String str = ko4Var.s;
            int i = ko4Var.V;
            int i2 = ko4Var.W;
            if (eg7.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                x1c V = lh2Var.V(4);
                int i3 = i * i2;
                long j6 = (this.n - this.h) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    V.e(0, new ey7());
                    V.a(i4 * j6, 0, 0, 0, null);
                }
            }
            this.I = cb3Var.d - this.b.e;
            lge.a(this.r);
            this.K = !this.J;
        } catch (Throwable th) {
            lge.a(this.r);
            throw th;
        }
    }

    @Override
    public final long b() {
        return this.s + this.F;
    }

    @Override
    public final void c() {
        this.J = true;
    }

    @Override
    public final boolean d() {
        return this.K;
    }
}
