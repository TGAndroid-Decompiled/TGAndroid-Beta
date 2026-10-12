package b2;

import v7.u6;
public final class n1 extends p1 {
    public final e9.n0 e;
    public final e9.n0 f2225f;
    public final int[] f2226g;
    public final int[] h;

    public n1(e9.x1 x1Var, e9.x1 x1Var2, int[] iArr) {
        boolean z10;
        if (x1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.e = x1Var;
        this.f2225f = x1Var2;
        this.f2226g = iArr;
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
        return this.f2226g[0];
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
            return this.f2226g[n0Var.size() - 1];
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
            return this.f2226g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final m1 f(int i10, m1 m1Var, boolean z10) {
        m1 m1Var2 = (m1) this.f2225f.get(i10);
        m1Var.h(m1Var2.f2211a, m1Var2.f2212b, m1Var2.f2213c, m1Var2.d, m1Var2.e, m1Var2.f2215g, m1Var2.f2214f);
        return m1Var;
    }

    @Override
    public final int h() {
        return this.f2225f.size();
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
            return this.f2226g[this.h[i10] - 1];
        } else {
            return i10 - 1;
        }
    }

    @Override
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final o1 m(int i10, o1 o1Var, long j10) {
        o1 o1Var2 = (o1) this.e.get(i10);
        o1Var.b(o1Var2.f2258a, o1Var2.f2260c, o1Var2.d, o1Var2.e, o1Var2.f2261f, o1Var2.f2262g, o1Var2.h, o1Var2.f2263i, o1Var2.f2264j, o1Var2.f2266l, o1Var2.f2267m, o1Var2.f2268n, o1Var2.f2269o, o1Var2.f2270p);
        o1Var.f2265k = o1Var2.f2265k;
        return o1Var;
    }

    @Override
    public final int o() {
        return this.e.size();
    }
}
