package b2;
public final class i1 extends k1 {
    public final e9.i0 f2070e;
    public final e9.i0 f2071f;
    public final int[] f2072g;
    public final int[] h;

    public i1(e9.a1 a1Var, e9.a1 a1Var2, int[] iArr) {
        boolean z10;
        if (a1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f2070e = a1Var;
        this.f2071f = a1Var2;
        this.f2072g = iArr;
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
        return this.f2072g[0];
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
        e9.i0 i0Var = this.f2070e;
        if (z10) {
            return this.f2072g[i0Var.size() - 1];
        }
        return i0Var.size() - 1;
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
            return this.f2072g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        h1 h1Var2 = (h1) this.f2071f.get(i10);
        h1Var.h(h1Var2.f2054a, h1Var2.f2055b, h1Var2.f2056c, h1Var2.d, h1Var2.f2057e, h1Var2.f2059g, h1Var2.f2058f);
        return h1Var;
    }

    @Override
    public final int h() {
        return this.f2071f.size();
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
            return this.f2072g[this.h[i10] - 1];
        } else {
            return i10 - 1;
        }
    }

    @Override
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final j1 m(int i10, j1 j1Var, long j3) {
        j1 j1Var2 = (j1) this.f2070e.get(i10);
        j1Var.b(j1Var2.f2106a, j1Var2.f2108c, j1Var2.d, j1Var2.f2109e, j1Var2.f2110f, j1Var2.f2111g, j1Var2.h, j1Var2.f2112i, j1Var2.f2113j, j1Var2.f2115l, j1Var2.f2116m, j1Var2.f2117n, j1Var2.f2118o, j1Var2.f2119p);
        j1Var.f2114k = j1Var2.f2114k;
        return j1Var;
    }

    @Override
    public final int o() {
        return this.f2070e.size();
    }
}
