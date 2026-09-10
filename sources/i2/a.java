package i2;

import android.util.Pair;
public abstract class a extends b2.k1 {
    public static final int f10097g = 0;
    public final int e;
    public final u2.i1 f10098f;

    public a(u2.i1 i1Var) {
        this.f10098f = i1Var;
        this.e = i1Var.getLength();
    }

    @Override
    public final int a(boolean z10) {
        int i10;
        if (this.e == 0) {
            return -1;
        }
        if (z10) {
            i10 = this.f10098f.b();
        } else {
            i10 = 0;
        }
        while (x(i10).p()) {
            i10 = w(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return x(i10).a(z10) + v(i10);
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
        int q6 = q(obj2);
        if (q6 == -1 || (b10 = x(q6).b(obj3)) == -1) {
            return -1;
        }
        return u(q6) + b10;
    }

    @Override
    public final int c(boolean z10) {
        int i10;
        int i11 = this.e;
        if (i11 == 0) {
            return -1;
        }
        u2.i1 i1Var = this.f10098f;
        if (z10) {
            i10 = i1Var.g();
        } else {
            i10 = i11 - 1;
        }
        while (x(i10).p()) {
            if (z10) {
                i10 = i1Var.c(i10);
                continue;
            } else if (i10 > 0) {
                i10--;
                continue;
            } else {
                i10 = -1;
                continue;
            }
            if (i10 == -1) {
                return -1;
            }
        }
        return x(i10).c(z10) + v(i10);
    }

    @Override
    public final int e(int i10, int i11, boolean z10) {
        int i12;
        int s10 = s(i10);
        int v = v(s10);
        b2.k1 x10 = x(s10);
        int i13 = i10 - v;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int e = x10.e(i13, i12, z10);
        if (e != -1) {
            return v + e;
        }
        int w10 = w(s10, z10);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z10);
        }
        if (w10 != -1) {
            return x(w10).a(z10) + v(w10);
        } else if (i11 != 2) {
            return -1;
        } else {
            return a(z10);
        }
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        int r10 = r(i10);
        int v = v(r10);
        x(r10).f(i10 - u(r10), h1Var, z10);
        h1Var.f1707c += v;
        if (z10) {
            Object t10 = t(r10);
            Object obj = h1Var.f1706b;
            obj.getClass();
            h1Var.f1706b = Pair.create(t10, obj);
        }
        return h1Var;
    }

    @Override
    public final b2.h1 g(Object obj, b2.h1 h1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q6 = q(obj2);
        int v = v(q6);
        x(q6).g(obj3, h1Var);
        h1Var.f1707c += v;
        h1Var.f1706b = obj;
        return h1Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i10) {
        int r10 = r(i10);
        return Pair.create(t(r10), x(r10).l(i10 - u(r10)));
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        int s10 = s(i10);
        int v = v(s10);
        int u10 = u(s10);
        x(s10).m(i10 - v, j1Var, j3);
        Object t10 = t(s10);
        if (!b2.j1.f1742q.equals(j1Var.f1751a)) {
            t10 = Pair.create(t10, j1Var.f1751a);
        }
        j1Var.f1751a = t10;
        j1Var.f1761n += u10;
        j1Var.f1762o += u10;
        return j1Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.f10098f.d(i10);
        }
        if (i10 < this.e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract b2.k1 x(int i10);
}
