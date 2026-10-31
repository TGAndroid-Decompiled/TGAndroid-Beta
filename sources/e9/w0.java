package e9;

import j$.util.Collection;
import java.util.Arrays;
public abstract class w0 extends i0 implements r1, Collection {
    public static final int d = 0;
    public transient x1 f6438b;
    public transient y0 f6439c;

    @Override
    public final boolean contains(Object obj) {
        if (((d2) this).e.b(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r1) {
                r1 r1Var = (r1) obj;
                d2 d2Var = (d2) this;
                if (d2Var.size() == r1Var.size()) {
                    w0 w0Var = (w0) r1Var;
                    if (t().size() == w0Var.t().size()) {
                        for (t1 t1Var : w0Var.t()) {
                            if (d2Var.e.b(t1Var.f6420a) != t1Var.a()) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return s.n(t());
    }

    @Override
    public final n0 l() {
        x1 x1Var = this.f6438b;
        if (x1Var == null) {
            n0 l4 = super.l();
            this.f6438b = (x1) l4;
            return l4;
        }
        return x1Var;
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        m2 it = t().iterator();
        while (it.hasNext()) {
            t1 t1Var = (t1) it.next();
            Arrays.fill(objArr, i10, t1Var.a() + i10, t1Var.f6420a);
            i10 += t1Var.a();
        }
        return i10;
    }

    @Override
    public final m2 r() {
        return new t0(t().iterator());
    }

    public abstract y0 s();

    public final y0 t() {
        y0 y0Var = this.f6439c;
        if (y0Var == null) {
            if (isEmpty()) {
                y0Var = e2.f6354s;
            } else {
                y0Var = new v0(this, 0);
            }
            this.f6439c = y0Var;
        }
        return y0Var;
    }

    @Override
    public final String toString() {
        return t().toString();
    }
}
