package e2;

import a8.ja;
public final class j1 extends l1 {
    public final h9.i0 f10130e;
    public final h9.i0 f10131f;
    public final int[] f10132g;
    public final int[] h;

    public j1(h9.s1 s1Var, h9.s1 s1Var2, int[] iArr) {
        boolean z10;
        if (s1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        this.f10130e = s1Var;
        this.f10131f = s1Var2;
        this.f10132g = iArr;
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
        return this.f10132g[0];
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
        h9.i0 i0Var = this.f10130e;
        if (z10) {
            return this.f10132g[i0Var.size() - 1];
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
            return this.f10132g[this.h[i7] + 1];
        } else {
            return i7 + 1;
        }
    }

    @Override
    public final i1 f(int i7, i1 i1Var, boolean z10) {
        i1 i1Var2 = (i1) this.f10131f.get(i7);
        i1Var.h(i1Var2.f10116a, i1Var2.f10117b, i1Var2.f10118c, i1Var2.d, i1Var2.f10119e, i1Var2.f10121g, i1Var2.f10120f);
        return i1Var;
    }

    @Override
    public final int h() {
        return this.f10131f.size();
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
            return this.f10132g[this.h[i7] - 1];
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
        k1 k1Var2 = (k1) this.f10130e.get(i7);
        k1Var.b(k1Var2.f10160a, k1Var2.f10162c, k1Var2.d, k1Var2.f10163e, k1Var2.f10164f, k1Var2.f10165g, k1Var2.h, k1Var2.f10166i, k1Var2.f10167j, k1Var2.f10169l, k1Var2.f10170m, k1Var2.f10171n, k1Var2.f10172o, k1Var2.f10173p);
        k1Var.f10168k = k1Var2.f10168k;
        return k1Var;
    }

    @Override
    public final int o() {
        return this.f10130e.size();
    }
}
