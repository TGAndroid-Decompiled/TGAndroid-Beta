package defpackage;
public final class ri2 implements jr9 {
    public final si2 a;
    public final hr9 b;
    public final int c;
    public boolean d;
    public final si2 e;

    public ri2(si2 si2Var, si2 si2Var2, hr9 hr9Var, int i) {
        this.e = si2Var;
        this.a = si2Var2;
        this.b = hr9Var;
        this.c = i;
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void b() {
        if (!this.d) {
            si2 si2Var = this.e;
            kq kqVar = si2Var.h;
            int[] iArr = si2Var.b;
            int i = this.c;
            kqVar.i(iArr[i], si2Var.c[i], 0, null, si2Var.K);
            this.d = true;
        }
    }

    @Override
    public final boolean i() {
        si2 si2Var = this.e;
        if (!si2Var.y() && this.b.A(si2Var.S)) {
            return true;
        }
        return false;
    }

    @Override
    public final int m(long j) {
        si2 si2Var = this.e;
        if (si2Var.y()) {
            return 0;
        }
        boolean z = si2Var.S;
        hr9 hr9Var = this.b;
        int x = hr9Var.x(j, z);
        ph0 ph0Var = si2Var.M;
        if (ph0Var != null) {
            x = Math.min(x, ph0Var.d(this.c + 1) - hr9Var.v());
        }
        hr9Var.L(x);
        if (x > 0) {
            b();
        }
        return x;
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        si2 si2Var = this.e;
        if (!si2Var.y()) {
            ph0 ph0Var = si2Var.M;
            hr9 hr9Var = this.b;
            if (ph0Var != null && ph0Var.d(this.c + 1) <= hr9Var.v()) {
                return -3;
            }
            b();
            return hr9Var.F(mj4Var, la3Var, i, si2Var.S);
        }
        return -3;
    }

    @Override
    public final void d() {
    }
}
