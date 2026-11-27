package defpackage;
public final class vh2 implements at9 {
    public final wh2 a;
    public final ys9 b;
    public final int c;
    public boolean d;
    public final wh2 e;

    public vh2(wh2 wh2Var, wh2 wh2Var2, ys9 ys9Var, int i) {
        this.e = wh2Var;
        this.a = wh2Var2;
        this.b = ys9Var;
        this.c = i;
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void b() {
        if (!this.d) {
            wh2 wh2Var = this.e;
            lp lpVar = wh2Var.h;
            int[] iArr = wh2Var.b;
            int i = this.c;
            lpVar.i(iArr[i], wh2Var.c[i], 0, null, wh2Var.K);
            this.d = true;
        }
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        wh2 wh2Var = this.e;
        if (!wh2Var.y()) {
            pg0 pg0Var = wh2Var.M;
            ys9 ys9Var = this.b;
            if (pg0Var != null && pg0Var.e(this.c + 1) <= ys9Var.v()) {
                return -3;
            }
            b();
            return ys9Var.F(ym4Var, s93Var, i, wh2Var.S);
        }
        return -3;
    }

    @Override
    public final boolean k() {
        wh2 wh2Var = this.e;
        if (!wh2Var.y() && this.b.A(wh2Var.S)) {
            return true;
        }
        return false;
    }

    @Override
    public final int o(long j) {
        wh2 wh2Var = this.e;
        if (wh2Var.y()) {
            return 0;
        }
        boolean z = wh2Var.S;
        ys9 ys9Var = this.b;
        int x = ys9Var.x(j, z);
        pg0 pg0Var = wh2Var.M;
        if (pg0Var != null) {
            x = Math.min(x, pg0Var.e(this.c + 1) - ys9Var.v());
        }
        ys9Var.L(x);
        if (x > 0) {
            b();
        }
        return x;
    }

    @Override
    public final void g() {
    }
}
