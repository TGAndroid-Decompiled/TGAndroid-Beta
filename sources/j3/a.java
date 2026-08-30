package j3;

import android.util.Pair;
public abstract class a extends o2 {
    public static final int d = 0;
    public final int f8419b;
    public final o4.q0 f8420c;

    public a(o4.q0 q0Var) {
        this.f8420c = q0Var;
        this.f8419b = q0Var.getLength();
    }

    @Override
    public final int a(boolean z4) {
        int i10;
        if (this.f8419b == 0) {
            return -1;
        }
        if (z4) {
            i10 = this.f8420c.a();
        } else {
            i10 = 0;
        }
        while (x(i10).p()) {
            i10 = w(i10, z4);
            if (i10 == -1) {
                return -1;
            }
        }
        return x(i10).a(z4) + v(i10);
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
    public final int c(boolean z4) {
        int i10;
        int i11 = this.f8419b;
        if (i11 == 0) {
            return -1;
        }
        o4.q0 q0Var = this.f8420c;
        if (z4) {
            i10 = q0Var.f();
        } else {
            i10 = i11 - 1;
        }
        while (x(i10).p()) {
            if (z4) {
                i10 = q0Var.c(i10);
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
        return x(i10).c(z4) + v(i10);
    }

    @Override
    public final int e(int i10, int i11, boolean z4) {
        int i12;
        int s6 = s(i10);
        int v = v(s6);
        o2 x10 = x(s6);
        int i13 = i10 - v;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int e = x10.e(i13, i12, z4);
        if (e != -1) {
            return v + e;
        }
        int w10 = w(s6, z4);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z4);
        }
        if (w10 != -1) {
            return x(w10).a(z4) + v(w10);
        } else if (i11 != 2) {
            return -1;
        } else {
            return a(z4);
        }
    }

    @Override
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        int r10 = r(i10);
        int v = v(r10);
        x(r10).f(i10 - u(r10), m2Var, z4);
        m2Var.f8704c += v;
        if (z4) {
            Object t6 = t(r10);
            Object obj = m2Var.f8703b;
            obj.getClass();
            m2Var.f8703b = Pair.create(t6, obj);
        }
        return m2Var;
    }

    @Override
    public final m2 g(Object obj, m2 m2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v = v(q10);
        x(q10).g(obj3, m2Var);
        m2Var.f8704c += v;
        m2Var.f8703b = obj;
        return m2Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: j3.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i10) {
        int r10 = r(i10);
        return Pair.create(t(r10), x(r10).l(i10 - u(r10)));
    }

    @Override
    public final n2 m(int i10, n2 n2Var, long j10) {
        int s6 = s(i10);
        int v = v(s6);
        int u10 = u(s6);
        x(s6).m(i10 - v, n2Var, j10);
        Object t6 = t(s6);
        if (!n2.E.equals(n2Var.f8749a)) {
            t6 = Pair.create(t6, n2Var.f8749a);
        }
        n2Var.f8749a = t6;
        n2Var.B += u10;
        n2Var.C += u10;
        return n2Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z4) {
        if (z4) {
            return this.f8420c.d(i10);
        }
        if (i10 < this.f8419b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract o2 x(int i10);
}
