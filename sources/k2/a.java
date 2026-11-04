package k2;

import android.util.Pair;
public abstract class a extends d2.n1 {
    public static final int f16436g = 0;
    public final int f16437e;
    public final w2.i1 f16438f;

    public a(w2.i1 i1Var) {
        this.f16438f = i1Var;
        this.f16437e = i1Var.getLength();
    }

    @Override
    public final int a(boolean z10) {
        int i3;
        if (this.f16437e == 0) {
            return -1;
        }
        if (z10) {
            i3 = this.f16438f.b();
        } else {
            i3 = 0;
        }
        while (x(i3).p()) {
            i3 = w(i3, z10);
            if (i3 == -1) {
                return -1;
            }
        }
        return x(i3).a(z10) + v(i3);
    }

    @Override
    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        if (q10 == -1 || (b10 = x(q10).b(obj3)) == -1) {
            return -1;
        }
        return u(q10) + b10;
    }

    @Override
    public final int c(boolean z10) {
        int i3;
        int i10 = this.f16437e;
        if (i10 == 0) {
            return -1;
        }
        w2.i1 i1Var = this.f16438f;
        if (z10) {
            i3 = i1Var.h();
        } else {
            i3 = i10 - 1;
        }
        while (x(i3).p()) {
            if (z10) {
                i3 = i1Var.d(i3);
                continue;
            } else if (i3 > 0) {
                i3--;
                continue;
            } else {
                i3 = -1;
                continue;
            }
            if (i3 == -1) {
                return -1;
            }
        }
        return x(i3).c(z10) + v(i3);
    }

    @Override
    public final int e(int i3, int i10, boolean z10) {
        int i11;
        int s6 = s(i3);
        int v = v(s6);
        d2.n1 x10 = x(s6);
        int i12 = i3 - v;
        if (i10 == 2) {
            i11 = 0;
        } else {
            i11 = i10;
        }
        int e10 = x10.e(i12, i11, z10);
        if (e10 != -1) {
            return v + e10;
        }
        int w10 = w(s6, z10);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z10);
        }
        if (w10 != -1) {
            return x(w10).a(z10) + v(w10);
        } else if (i10 != 2) {
            return -1;
        } else {
            return a(z10);
        }
    }

    @Override
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        int r5 = r(i3);
        int v = v(r5);
        x(r5).f(i3 - u(r5), k1Var, z10);
        k1Var.f8163c += v;
        if (z10) {
            Object t10 = t(r5);
            Object obj = k1Var.f8162b;
            obj.getClass();
            k1Var.f8162b = Pair.create(t10, obj);
        }
        return k1Var;
    }

    @Override
    public final d2.k1 g(Object obj, d2.k1 k1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, k1Var);
        k1Var.f8163c += v;
        k1Var.f8162b = obj;
        return k1Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: k2.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i3) {
        int r5 = r(i3);
        return Pair.create(t(r5), x(r5).l(i3 - u(r5)));
    }

    @Override
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        int s6 = s(i3);
        int v = v(s6);
        int u10 = u(s6);
        x(s6).m(i3 - v, m1Var, j10);
        Object t10 = t(s6);
        if (!d2.m1.f8199q.equals(m1Var.f8208a)) {
            t10 = Pair.create(t10, m1Var.f8208a);
        }
        m1Var.f8208a = t10;
        m1Var.f8219n += u10;
        m1Var.f8220o += u10;
        return m1Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i3);

    public abstract int s(int i3);

    public abstract Object t(int i3);

    public abstract int u(int i3);

    public abstract int v(int i3);

    public final int w(int i3, boolean z10) {
        if (z10) {
            return this.f16438f.e(i3);
        }
        if (i3 < this.f16437e - 1) {
            return i3 + 1;
        }
        return -1;
    }

    public abstract d2.n1 x(int i3);
}
