package d2;

import b8.zb;
public final class l1 extends n1 {
    public final g9.i0 f8179e;
    public final g9.i0 f8180f;
    public final int[] f8181g;
    public final int[] h;

    public l1(g9.s1 s1Var, g9.s1 s1Var2, int[] iArr) {
        boolean z10;
        if (s1Var.d == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f8179e = s1Var;
        this.f8180f = s1Var2;
        this.f8181g = iArr;
        this.h = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.h[iArr[i3]] = i3;
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
        return this.f8181g[0];
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
        g9.i0 i0Var = this.f8179e;
        if (z10) {
            return this.f8181g[i0Var.size() - 1];
        }
        return i0Var.size() - 1;
    }

    @Override
    public final int e(int i3, int i10, boolean z10) {
        if (i10 == 1) {
            return i3;
        }
        if (i3 == c(z10)) {
            if (i10 == 2) {
                return a(z10);
            }
            return -1;
        } else if (z10) {
            return this.f8181g[this.h[i3] + 1];
        } else {
            return i3 + 1;
        }
    }

    @Override
    public final k1 f(int i3, k1 k1Var, boolean z10) {
        k1 k1Var2 = (k1) this.f8180f.get(i3);
        k1Var.h(k1Var2.f8161a, k1Var2.f8162b, k1Var2.f8163c, k1Var2.d, k1Var2.f8164e, k1Var2.f8166g, k1Var2.f8165f);
        return k1Var;
    }

    @Override
    public final int h() {
        return this.f8180f.size();
    }

    @Override
    public final int k(int i3, int i10, boolean z10) {
        if (i10 == 1) {
            return i3;
        }
        if (i3 == a(z10)) {
            if (i10 == 2) {
                return c(z10);
            }
            return -1;
        } else if (z10) {
            return this.f8181g[this.h[i3] - 1];
        } else {
            return i3 - 1;
        }
    }

    @Override
    public final Object l(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final m1 m(int i3, m1 m1Var, long j10) {
        m1 m1Var2 = (m1) this.f8179e.get(i3);
        m1Var.b(m1Var2.f8208a, m1Var2.f8210c, m1Var2.d, m1Var2.f8211e, m1Var2.f8212f, m1Var2.f8213g, m1Var2.h, m1Var2.f8214i, m1Var2.f8215j, m1Var2.f8217l, m1Var2.f8218m, m1Var2.f8219n, m1Var2.f8220o, m1Var2.f8221p);
        m1Var.f8216k = m1Var2.f8216k;
        return m1Var;
    }

    @Override
    public final int o() {
        return this.f8179e.size();
    }
}
