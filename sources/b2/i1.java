package b2;
public final class i1 extends k1 {
    public final e9.i0 e;
    public final e9.i0 f3017f;
    public final int[] f3018g;
    public final int[] h;

    public i1(e9.a1 a1Var, e9.a1 a1Var2, int[] iArr) {
        boolean z10;
        if (a1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.e = a1Var;
        this.f3017f = a1Var2;
        this.f3018g = iArr;
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
        return this.f3018g[0];
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
        e9.i0 i0Var = this.e;
        if (z10) {
            return this.f3018g[i0Var.size() - 1];
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
            return this.f3018g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        h1 h1Var2 = (h1) this.f3017f.get(i10);
        h1Var.h(h1Var2.f3004a, h1Var2.f3005b, h1Var2.f3006c, h1Var2.d, h1Var2.e, h1Var2.f3008g, h1Var2.f3007f);
        return h1Var;
    }

    @Override
    public final int h() {
        return this.f3017f.size();
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
            return this.f3018g[this.h[i10] - 1];
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
        j1 j1Var2 = (j1) this.e.get(i10);
        j1Var.b(j1Var2.f3050a, j1Var2.f3052c, j1Var2.d, j1Var2.e, j1Var2.f3053f, j1Var2.f3054g, j1Var2.h, j1Var2.f3055i, j1Var2.f3056j, j1Var2.f3058l, j1Var2.f3059m, j1Var2.f3060n, j1Var2.f3061o, j1Var2.f3062p);
        j1Var.f3057k = j1Var2.f3057k;
        return j1Var;
    }

    @Override
    public final int o() {
        return this.e.size();
    }
}
