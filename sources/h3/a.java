package h3;

import android.util.Pair;
public abstract class a extends r2 {
    public static final int d = 0;
    public final int f9330b;
    public final j4.g1 f9331c;

    public a(j4.g1 g1Var) {
        this.f9331c = g1Var;
        this.f9330b = g1Var.getLength();
    }

    @Override
    public final int a(boolean z10) {
        int i9;
        if (this.f9330b == 0) {
            return -1;
        }
        if (z10) {
            i9 = this.f9331c.b();
        } else {
            i9 = 0;
        }
        while (x(i9).p()) {
            i9 = w(i9, z10);
            if (i9 == -1) {
                return -1;
            }
        }
        return x(i9).a(z10) + v(i9);
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
        int i9;
        int i10 = this.f9330b;
        if (i10 == 0) {
            return -1;
        }
        j4.g1 g1Var = this.f9331c;
        if (z10) {
            i9 = g1Var.f();
        } else {
            i9 = i10 - 1;
        }
        while (x(i9).p()) {
            if (z10) {
                i9 = g1Var.c(i9);
                continue;
            } else if (i9 > 0) {
                i9--;
                continue;
            } else {
                i9 = -1;
                continue;
            }
            if (i9 == -1) {
                return -1;
            }
        }
        return x(i9).c(z10) + v(i9);
    }

    @Override
    public final int e(int i9, int i10, boolean z10) {
        int i11;
        int s10 = s(i9);
        int v = v(s10);
        r2 x10 = x(s10);
        int i12 = i9 - v;
        if (i10 == 2) {
            i11 = 0;
        } else {
            i11 = i10;
        }
        int e10 = x10.e(i12, i11, z10);
        if (e10 != -1) {
            return v + e10;
        }
        int w8 = w(s10, z10);
        while (w8 != -1 && x(w8).p()) {
            w8 = w(w8, z10);
        }
        if (w8 != -1) {
            return x(w8).a(z10) + v(w8);
        } else if (i10 != 2) {
            return -1;
        } else {
            return a(z10);
        }
    }

    @Override
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        int r10 = r(i9);
        int v = v(r10);
        x(r10).f(i9 - u(r10), p2Var, z10);
        p2Var.f9639c += v;
        if (z10) {
            Object t10 = t(r10);
            Object obj = p2Var.f9638b;
            obj.getClass();
            p2Var.f9638b = Pair.create(t10, obj);
        }
        return p2Var;
    }

    @Override
    public final p2 g(Object obj, p2 p2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, p2Var);
        p2Var.f9639c += v;
        p2Var.f9638b = obj;
        return p2Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: h3.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i9) {
        int r10 = r(i9);
        return Pair.create(t(r10), x(r10).l(i9 - u(r10)));
    }

    @Override
    public final q2 m(int i9, q2 q2Var, long j10) {
        int s10 = s(i9);
        int v = v(s10);
        int u10 = u(s10);
        x(s10).m(i9 - v, q2Var, j10);
        Object t10 = t(s10);
        if (!q2.D.equals(q2Var.f9658a)) {
            t10 = Pair.create(t10, q2Var.f9658a);
        }
        q2Var.f9658a = t10;
        q2Var.A += u10;
        q2Var.B += u10;
        return q2Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i9);

    public abstract int s(int i9);

    public abstract Object t(int i9);

    public abstract int u(int i9);

    public abstract int v(int i9);

    public final int w(int i9, boolean z10) {
        if (z10) {
            return this.f9331c.d(i9);
        }
        if (i9 < this.f9330b - 1) {
            return i9 + 1;
        }
        return -1;
    }

    public abstract r2 x(int i9);
}
