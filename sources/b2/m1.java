package b2;

import v7.u6;
public final class m1 extends o1 {
    public final e9.n0 e;
    public final e9.n0 f3836f;
    public final int[] f3837g;
    public final int[] h;

    public m1(e9.x1 x1Var, e9.x1 x1Var2, int[] iArr) {
        boolean z10;
        if (x1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.e = x1Var;
        this.f3836f = x1Var2;
        this.f3837g = iArr;
        this.h = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.h[iArr[i10]] = i10;
        }
    }

    @Override
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (!z10) {
            return 0;
        }
        return this.f3837g[0];
    }

    @Override
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        e9.n0 n0Var = this.e;
        if (z10) {
            return this.f3837g[n0Var.size() - 1];
        }
        return n0Var.size() - 1;
    }

    @Override
    public final int e(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == c(z10)) {
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        } else if (z10) {
            return this.f3837g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final l1 f(int i10, l1 l1Var, boolean z10) {
        l1 l1Var2 = (l1) this.f3836f.get(i10);
        l1Var.h(l1Var2.f3822a, l1Var2.f3823b, l1Var2.f3824c, l1Var2.d, l1Var2.e, l1Var2.f3826g, l1Var2.f3825f);
        return l1Var;
    }

    @Override
    public final int h() {
        return this.f3836f.size();
    }

    @Override
    public final int k(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == a(z10)) {
            if (i11 == 2) {
                return c(z10);
            }
            return -1;
        } else if (z10) {
            return this.f3837g[this.h[i10] - 1];
        } else {
            return i10 - 1;
        }
    }

    @Override
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final n1 m(int i10, n1 n1Var, long j10) {
        n1 n1Var2 = (n1) this.e.get(i10);
        n1Var.b(n1Var2.f3869a, n1Var2.f3871c, n1Var2.d, n1Var2.e, n1Var2.f3872f, n1Var2.f3873g, n1Var2.h, n1Var2.f3874i, n1Var2.f3875j, n1Var2.f3877l, n1Var2.f3878m, n1Var2.f3879n, n1Var2.f3880o, n1Var2.f3881p);
        n1Var.f3876k = n1Var2.f3876k;
        return n1Var;
    }

    @Override
    public final int o() {
        return this.e.size();
    }
}
