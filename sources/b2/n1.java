package b2;

import a8.yb;
public final class n1 extends p1 {
    public final f9.i0 e;
    public final f9.i0 f3292f;
    public final int[] f3293g;
    public final int[] h;

    public n1(f9.s1 s1Var, f9.s1 s1Var2, int[] iArr) {
        boolean z10;
        if (s1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.e = s1Var;
        this.f3292f = s1Var2;
        this.f3293g = iArr;
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
        return this.f3293g[0];
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
        f9.i0 i0Var = this.e;
        if (z10) {
            return this.f3293g[i0Var.size() - 1];
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
            return this.f3293g[this.h[i10] + 1];
        } else {
            return i10 + 1;
        }
    }

    @Override
    public final m1 f(int i10, m1 m1Var, boolean z10) {
        m1 m1Var2 = (m1) this.f3292f.get(i10);
        m1Var.h(m1Var2.f3278a, m1Var2.f3279b, m1Var2.f3280c, m1Var2.d, m1Var2.e, m1Var2.f3282g, m1Var2.f3281f);
        return m1Var;
    }

    @Override
    public final int h() {
        return this.f3292f.size();
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
            return this.f3293g[this.h[i10] - 1];
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
        o1Var.b(o1Var2.f3325a, o1Var2.f3327c, o1Var2.d, o1Var2.e, o1Var2.f3328f, o1Var2.f3329g, o1Var2.h, o1Var2.f3330i, o1Var2.f3331j, o1Var2.f3333l, o1Var2.f3334m, o1Var2.f3335n, o1Var2.f3336o, o1Var2.f3337p);
        o1Var.f3332k = o1Var2.f3332k;
        return o1Var;
    }

    @Override
    public final int o() {
        return this.e.size();
    }
}
