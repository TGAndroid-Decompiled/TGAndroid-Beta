package b2;

import v7.u6;
public final class n1 extends p1 {
    public final e9.n0 e;
    public final e9.n0 f2229f;
    public final int[] f2230g;
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
        this.f2229f = x1Var2;
        this.f2230g = iArr;
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
        return this.f2230g[0];
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
            return this.f2230g[n0Var.size() - 1];
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
            return this.f2230g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final m1 f(int i10, m1 m1Var, boolean z10) {
        m1 m1Var2 = (m1) this.f2229f.get(i10);
        m1Var.h(m1Var2.f2215a, m1Var2.f2216b, m1Var2.f2217c, m1Var2.d, m1Var2.e, m1Var2.f2219g, m1Var2.f2218f);
        return m1Var;
    }

    @Override
    public final int h() {
        return this.f2229f.size();
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
            return this.f2230g[this.h[i10] - 1];
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
        o1Var.b(o1Var2.f2262a, o1Var2.f2264c, o1Var2.d, o1Var2.e, o1Var2.f2265f, o1Var2.f2266g, o1Var2.h, o1Var2.f2267i, o1Var2.f2268j, o1Var2.f2270l, o1Var2.f2271m, o1Var2.f2272n, o1Var2.f2273o, o1Var2.f2274p);
        o1Var.f2269k = o1Var2.f2269k;
        return o1Var;
    }

    @Override
    public final int o() {
        return this.e.size();
    }
}
