package h3;

import android.util.Pair;

public abstract class a extends s2 {
    public static final int d = 0;

    public final int f7762b;

    public final j4.g1 f7763c;

    public a(j4.g1 g1Var) {
        this.f7763c = g1Var;
        this.f7762b = g1Var.getLength();
    }

    @Override
    public final int a(boolean z10) {
        if (this.f7762b != 0) {
            int iB = z10 ? this.f7763c.b() : 0;
            while (x(iB).p()) {
                iB = w(iB, z10);
                if (iB == -1) {
                }
            }
            return x(iB).a(z10) + v(iB);
        }
        return -1;
    }

    @Override
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = x(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override
    public final int c(boolean z10) {
        int i10 = this.f7762b;
        if (i10 != 0) {
            j4.g1 g1Var = this.f7763c;
            int iF = z10 ? g1Var.f() : i10 - 1;
            while (x(iF).p()) {
                if (z10) {
                    iF = g1Var.c(iF);
                } else {
                    iF = iF > 0 ? iF - 1 : -1;
                }
                if (iF == -1) {
                }
            }
            return x(iF).c(z10) + v(iF);
        }
        return -1;
    }

    @Override
    public final int e(int i10, int i11, boolean z10) {
        int iS = s(i10);
        int iV = v(iS);
        int iE = x(iS).e(i10 - iV, i11 == 2 ? 0 : i11, z10);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z10);
        while (iW != -1 && x(iW).p()) {
            iW = w(iW, z10);
        }
        if (iW != -1) {
            return x(iW).a(z10) + v(iW);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        int iR = r(i10);
        int iV = v(iR);
        x(iR).f(i10 - u(iR), p2Var, z10);
        p2Var.f8069c += iV;
        if (z10) {
            Object objT = t(iR);
            Object obj = p2Var.f8068b;
            obj.getClass();
            p2Var.f8068b = Pair.create(objT, obj);
        }
        return p2Var;
    }

    @Override
    public final p2 g(Object obj, p2 p2Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        x(iQ).g(obj3, p2Var);
        p2Var.f8069c += iV;
        p2Var.f8068b = obj;
        return p2Var;
    }

    @Override
    public final int k(int r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: h3.a.k(int, int, boolean):int");
    }

    @Override
    public final Object l(int i10) {
        int iR = r(i10);
        return Pair.create(t(iR), x(iR).l(i10 - u(iR)));
    }

    @Override
    public final r2 m(int i10, r2 r2Var, long j10) {
        int iS = s(i10);
        int iV = v(iS);
        int iU = u(iS);
        x(iS).m(i10 - iV, r2Var, j10);
        Object objT = t(iS);
        if (!r2.D.equals(r2Var.f8112a)) {
            objT = Pair.create(objT, r2Var.f8112a);
        }
        r2Var.f8112a = objT;
        r2Var.A += iU;
        r2Var.B += iU;
        return r2Var;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.f7763c.d(i10);
        }
        if (i10 < this.f7762b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract s2 x(int i10);
}
