package e2;

import a8.la;
public final class j1 extends l1 {
    public final h9.i0 f10474e;
    public final h9.i0 f10475f;
    public final int[] f10476g;
    public final int[] h;

    public j1(h9.t1 t1Var, h9.t1 t1Var2, int[] iArr) {
        boolean z10;
        if (t1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f10474e = t1Var;
        this.f10475f = t1Var2;
        this.f10476g = iArr;
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
        return this.f10476g[0];
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
        h9.i0 i0Var = this.f10474e;
        if (z10) {
            return this.f10476g[i0Var.size() - 1];
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
            return this.f10476g[this.h[i7] + 1];
        } else {
            return i7 + 1;
        }
    }

    @Override
    public final i1 f(int i7, i1 i1Var, boolean z10) {
        i1 i1Var2 = (i1) this.f10475f.get(i7);
        i1Var.h(i1Var2.f10460a, i1Var2.f10461b, i1Var2.f10462c, i1Var2.d, i1Var2.f10463e, i1Var2.f10465g, i1Var2.f10464f);
        return i1Var;
    }

    @Override
    public final int h() {
        return this.f10475f.size();
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
            return this.f10476g[this.h[i7] - 1];
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
        k1 k1Var2 = (k1) this.f10474e.get(i7);
        k1Var.b(k1Var2.f10504a, k1Var2.f10506c, k1Var2.d, k1Var2.f10507e, k1Var2.f10508f, k1Var2.f10509g, k1Var2.h, k1Var2.f10510i, k1Var2.f10511j, k1Var2.f10513l, k1Var2.f10514m, k1Var2.f10515n, k1Var2.f10516o, k1Var2.f10517p);
        k1Var.f10512k = k1Var2.f10512k;
        return k1Var;
    }

    @Override
    public final int o() {
        return this.f10474e.size();
    }
}
