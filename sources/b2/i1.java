package b2;
public final class i1 extends k1 {
    public final e9.i0 f2097e;
    public final e9.i0 f2098f;
    public final int[] f2099g;
    public final int[] h;

    public i1(e9.a1 a1Var, e9.a1 a1Var2, int[] iArr) {
        boolean z10;
        if (a1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f2097e = a1Var;
        this.f2098f = a1Var2;
        this.f2099g = iArr;
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
        return this.f2099g[0];
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
        e9.i0 i0Var = this.f2097e;
        if (z10) {
            return this.f2099g[i0Var.size() - 1];
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
            return this.f2099g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        h1 h1Var2 = (h1) this.f2098f.get(i10);
        h1Var.h(h1Var2.f2081a, h1Var2.f2082b, h1Var2.f2083c, h1Var2.d, h1Var2.f2084e, h1Var2.f2086g, h1Var2.f2085f);
        return h1Var;
    }

    @Override
    public final int h() {
        return this.f2098f.size();
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
            return this.f2099g[this.h[i10] - 1];
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
        j1 j1Var2 = (j1) this.f2097e.get(i10);
        j1Var.b(j1Var2.f2133a, j1Var2.f2135c, j1Var2.d, j1Var2.f2136e, j1Var2.f2137f, j1Var2.f2138g, j1Var2.h, j1Var2.f2139i, j1Var2.f2140j, j1Var2.f2142l, j1Var2.f2143m, j1Var2.f2144n, j1Var2.f2145o, j1Var2.f2146p);
        j1Var.f2141k = j1Var2.f2141k;
        return j1Var;
    }

    @Override
    public final int o() {
        return this.f2097e.size();
    }
}
