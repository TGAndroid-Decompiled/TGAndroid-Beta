package b2;
public final class i1 extends k1 {
    public final e9.i0 f3343e;
    public final e9.i0 f3344f;
    public final int[] f3345g;
    public final int[] h;

    public i1(e9.a1 a1Var, e9.a1 a1Var2, int[] iArr) {
        boolean z10;
        if (a1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f3343e = a1Var;
        this.f3344f = a1Var2;
        this.f3345g = iArr;
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
        return this.f3345g[0];
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
        e9.i0 i0Var = this.f3343e;
        if (z10) {
            return this.f3345g[i0Var.size() - 1];
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
            return this.f3345g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        h1 h1Var2 = (h1) this.f3344f.get(i10);
        h1Var.h(h1Var2.f3327a, h1Var2.f3328b, h1Var2.f3329c, h1Var2.d, h1Var2.f3330e, h1Var2.f3332g, h1Var2.f3331f);
        return h1Var;
    }

    @Override
    public final int h() {
        return this.f3344f.size();
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
            return this.f3345g[this.h[i10] - 1];
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
        j1 j1Var2 = (j1) this.f3343e.get(i10);
        j1Var.b(j1Var2.f3379a, j1Var2.f3381c, j1Var2.d, j1Var2.f3382e, j1Var2.f3383f, j1Var2.f3384g, j1Var2.h, j1Var2.f3385i, j1Var2.f3386j, j1Var2.f3388l, j1Var2.f3389m, j1Var2.f3390n, j1Var2.f3391o, j1Var2.f3392p);
        j1Var.f3387k = j1Var2.f3387k;
        return j1Var;
    }

    @Override
    public final int o() {
        return this.f3343e.size();
    }
}
