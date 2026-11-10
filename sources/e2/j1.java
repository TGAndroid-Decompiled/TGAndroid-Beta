package e2;

import a8.ia;
public final class j1 extends l1 {
    public final h9.i0 f10299e;
    public final h9.i0 f10300f;
    public final int[] f10301g;
    public final int[] h;

    public j1(h9.t1 t1Var, h9.t1 t1Var2, int[] iArr) {
        boolean z9;
        if (t1Var.d == iArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f10299e = t1Var;
        this.f10300f = t1Var2;
        this.f10301g = iArr;
        this.h = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.h[iArr[i7]] = i7;
        }
    }

    @Override
    public final int a(boolean z9) {
        if (p()) {
            return -1;
        }
        if (!z9) {
            return 0;
        }
        return this.f10301g[0];
    }

    @Override
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int c(boolean z9) {
        if (p()) {
            return -1;
        }
        h9.i0 i0Var = this.f10299e;
        if (z9) {
            return this.f10301g[i0Var.size() - 1];
        }
        return i0Var.size() - 1;
    }

    @Override
    public final int e(int i7, int i10, boolean z9) {
        if (i10 == 1) {
            return i7;
        }
        if (i7 == c(z9)) {
            if (i10 == 2) {
                return a(z9);
            }
            return -1;
        } else if (z9) {
            return this.f10301g[this.h[i7] + 1];
        } else {
            return i7 + 1;
        }
    }

    @Override
    public final i1 f(int i7, i1 i1Var, boolean z9) {
        i1 i1Var2 = (i1) this.f10300f.get(i7);
        i1Var.h(i1Var2.f10285a, i1Var2.f10286b, i1Var2.f10287c, i1Var2.d, i1Var2.f10288e, i1Var2.f10290g, i1Var2.f10289f);
        return i1Var;
    }

    @Override
    public final int h() {
        return this.f10300f.size();
    }

    @Override
    public final int k(int i7, int i10, boolean z9) {
        if (i10 == 1) {
            return i7;
        }
        if (i7 == a(z9)) {
            if (i10 == 2) {
                return c(z9);
            }
            return -1;
        } else if (z9) {
            return this.f10301g[this.h[i7] - 1];
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
        k1 k1Var2 = (k1) this.f10299e.get(i7);
        k1Var.b(k1Var2.f10329a, k1Var2.f10331c, k1Var2.d, k1Var2.f10332e, k1Var2.f10333f, k1Var2.f10334g, k1Var2.h, k1Var2.f10335i, k1Var2.f10336j, k1Var2.f10338l, k1Var2.f10339m, k1Var2.f10340n, k1Var2.f10341o, k1Var2.f10342p);
        k1Var.f10337k = k1Var2.f10337k;
        return k1Var;
    }

    @Override
    public final int o() {
        return this.f10299e.size();
    }
}
