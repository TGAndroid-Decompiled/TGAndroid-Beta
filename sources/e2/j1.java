package e2;

import a8.la;
public final class j1 extends l1 {
    public final h9.i0 f10448e;
    public final h9.i0 f10449f;
    public final int[] f10450g;
    public final int[] h;

    public j1(h9.t1 t1Var, h9.t1 t1Var2, int[] iArr) {
        boolean z10;
        if (t1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f10448e = t1Var;
        this.f10449f = t1Var2;
        this.f10450g = iArr;
        this.h = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.h[iArr[i7]] = i7;
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
        return this.f10450g[0];
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
        h9.i0 i0Var = this.f10448e;
        if (z10) {
            return this.f10450g[i0Var.size() - 1];
        }
        return i0Var.size() - 1;
    }

    @Override
    public final int e(int i7, int i10, boolean z10) {
        if (i10 == 1) {
            return i7;
        }
        if (i7 == c(z10)) {
            if (i10 == 2) {
                return a(z10);
            }
            return -1;
        } else if (z10) {
            return this.f10450g[this.h[i7] + 1];
        } else {
            return i7 + 1;
        }
    }

    @Override
    public final i1 f(int i7, i1 i1Var, boolean z10) {
        i1 i1Var2 = (i1) this.f10449f.get(i7);
        i1Var.h(i1Var2.f10434a, i1Var2.f10435b, i1Var2.f10436c, i1Var2.d, i1Var2.f10437e, i1Var2.f10439g, i1Var2.f10438f);
        return i1Var;
    }

    @Override
    public final int h() {
        return this.f10449f.size();
    }

    @Override
    public final int k(int i7, int i10, boolean z10) {
        if (i10 == 1) {
            return i7;
        }
        if (i7 == a(z10)) {
            if (i10 == 2) {
                return c(z10);
            }
            return -1;
        } else if (z10) {
            return this.f10450g[this.h[i7] - 1];
        } else {
            return i7 - 1;
        }
    }

    @Override
    public final Object l(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final k1 m(int i7, k1 k1Var, long j3) {
        k1 k1Var2 = (k1) this.f10448e.get(i7);
        k1Var.b(k1Var2.f10478a, k1Var2.f10480c, k1Var2.d, k1Var2.f10481e, k1Var2.f10482f, k1Var2.f10483g, k1Var2.h, k1Var2.f10484i, k1Var2.f10485j, k1Var2.f10487l, k1Var2.f10488m, k1Var2.f10489n, k1Var2.f10490o, k1Var2.f10491p);
        k1Var.f10486k = k1Var2.f10486k;
        return k1Var;
    }

    @Override
    public final int o() {
        return this.f10448e.size();
    }
}
