package j3;

import android.util.Pair;
public abstract class a extends r2 {
    public static final int d = 0;
    public final int f10369b;
    public final l4.h1 f10370c;

    public a(l4.h1 h1Var) {
        this.f10370c = h1Var;
        this.f10369b = h1Var.getLength();
    }

    @Override
    public final int a(boolean z10) {
        int i10;
        if (this.f10369b == 0) {
            return -1;
        }
        if (z10) {
            i10 = this.f10370c.b();
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
        int i11 = this.f10369b;
        if (i11 == 0) {
            return -1;
        }
        l4.h1 h1Var = this.f10370c;
        if (z10) {
            i10 = h1Var.f();
        } else {
            i10 = i11 - 1;
        }
        while (x(i10).p()) {
            if (z10) {
                i10 = h1Var.c(i10);
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
        r2 x4 = x(s10);
        int i13 = i10 - v;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int e10 = x4.e(i13, i12, z10);
        if (e10 != -1) {
            return v + e10;
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
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        int r6 = r(i10);
        int v = v(r6);
        x(r6).f(i10 - u(r6), p2Var, z10);
        p2Var.f10676c += v;
        if (z10) {
            Object t10 = t(r6);
            Object obj = p2Var.f10675b;
            obj.getClass();
            p2Var.f10675b = Pair.create(t10, obj);
        }
        return p2Var;
    }

    @Override
    public final p2 g(Object obj, p2 p2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q6 = q(obj2);
        int v = v(q6);
        x(q6).g(obj3, p2Var);
        p2Var.f10676c += v;
        p2Var.f10675b = obj;
        return p2Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: j3.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i10) {
        int r6 = r(i10);
        return Pair.create(t(r6), x(r6).l(i10 - u(r6)));
    }

    @Override
    public final q2 m(int i10, q2 q2Var, long j10) {
        int s10 = s(i10);
        int v = v(s10);
        int u10 = u(s10);
        x(s10).m(i10 - v, q2Var, j10);
        Object t10 = t(s10);
        if (!q2.D.equals(q2Var.f10695a)) {
            t10 = Pair.create(t10, q2Var.f10695a);
        }
        q2Var.f10695a = t10;
        q2Var.A += u10;
        q2Var.B += u10;
        return q2Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.f10370c.d(i10);
        }
        if (i10 < this.f10369b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract r2 x(int i10);
}
