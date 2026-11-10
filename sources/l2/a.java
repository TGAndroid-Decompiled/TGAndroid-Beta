package l2;

import android.util.Pair;
public abstract class a extends e2.l1 {
    public static final int f17740g = 0;
    public final int f17741e;
    public final x2.g1 f17742f;

    public a(x2.g1 g1Var) {
        this.f17742f = g1Var;
        this.f17741e = g1Var.getLength();
    }

    @Override
    public final int a(boolean z9) {
        int i7;
        if (this.f17741e == 0) {
            return -1;
        }
        if (z9) {
            i7 = this.f17742f.b();
        } else {
            i7 = 0;
        }
        while (x(i7).p()) {
            i7 = w(i7, z9);
            if (i7 == -1) {
                return -1;
            }
        }
        return x(i7).a(z9) + v(i7);
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
    public final int c(boolean z9) {
        int i7;
        int i10 = this.f17741e;
        if (i10 == 0) {
            return -1;
        }
        x2.g1 g1Var = this.f17742f;
        if (z9) {
            i7 = g1Var.h();
        } else {
            i7 = i10 - 1;
        }
        while (x(i7).p()) {
            if (z9) {
                i7 = g1Var.d(i7);
                continue;
            } else if (i7 > 0) {
                i7--;
                continue;
            } else {
                i7 = -1;
                continue;
            }
            if (i7 == -1) {
                return -1;
            }
        }
        return x(i7).c(z9) + v(i7);
    }

    @Override
    public final int e(int i7, int i10, boolean z9) {
        int i11;
        int s5 = s(i7);
        int v = v(s5);
        e2.l1 x10 = x(s5);
        int i12 = i7 - v;
        if (i10 == 2) {
            i11 = 0;
        } else {
            i11 = i10;
        }
        int e10 = x10.e(i12, i11, z9);
        if (e10 != -1) {
            return v + e10;
        }
        int w10 = w(s5, z9);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z9);
        }
        if (w10 != -1) {
            return x(w10).a(z9) + v(w10);
        } else if (i10 != 2) {
            return -1;
        } else {
            return a(z9);
        }
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        int r10 = r(i7);
        int v = v(r10);
        x(r10).f(i7 - u(r10), i1Var, z9);
        i1Var.f10287c += v;
        if (z9) {
            Object t6 = t(r10);
            Object obj = i1Var.f10286b;
            obj.getClass();
            i1Var.f10286b = Pair.create(t6, obj);
        }
        return i1Var;
    }

    @Override
    public final e2.i1 g(Object obj, e2.i1 i1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, i1Var);
        i1Var.f10287c += v;
        i1Var.f10286b = obj;
        return i1Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: l2.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i7) {
        int r10 = r(i7);
        return Pair.create(t(r10), x(r10).l(i7 - u(r10)));
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        int s5 = s(i7);
        int v = v(s5);
        int u10 = u(s5);
        x(s5).m(i7 - v, k1Var, j3);
        Object t6 = t(s5);
        if (!e2.k1.f10320q.equals(k1Var.f10329a)) {
            t6 = Pair.create(t6, k1Var.f10329a);
        }
        k1Var.f10329a = t6;
        k1Var.f10340n += u10;
        k1Var.f10341o += u10;
        return k1Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i7);

    public abstract int s(int i7);

    public abstract Object t(int i7);

    public abstract int u(int i7);

    public abstract int v(int i7);

    public final int w(int i7, boolean z9) {
        if (z9) {
            return this.f17742f.e(i7);
        }
        if (i7 < this.f17741e - 1) {
            return i7 + 1;
        }
        return -1;
    }

    public abstract e2.l1 x(int i7);
}
