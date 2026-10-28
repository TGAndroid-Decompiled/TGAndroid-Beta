package f9;

import j$.util.Collection;
import java.util.Arrays;
public abstract class r0 extends d0 implements m1, Collection {
    public static final int d = 0;
    public transient s1 f10329b;
    public transient t0 f10330c;

    @Override
    public final boolean contains(Object obj) {
        if (((y1) this).e.b(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof m1) {
                m1 m1Var = (m1) obj;
                y1 y1Var = (y1) this;
                if (y1Var.size() == m1Var.size()) {
                    r0 r0Var = (r0) m1Var;
                    if (t().size() == r0Var.t().size()) {
                        for (o1 o1Var : r0Var.t()) {
                            if (y1Var.e.b(o1Var.f10313a) != o1Var.a()) {
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
    public final i0 h() {
        s1 s1Var = this.f10329b;
        if (s1Var == null) {
            i0 h = super.h();
            this.f10329b = (s1) h;
            return h;
        }
        return s1Var;
    }

    @Override
    public final int hashCode() {
        return o.n(t());
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        g2 it = t().iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            Arrays.fill(objArr, i10, o1Var.a() + i10, o1Var.f10313a);
            i10 += o1Var.a();
        }
        return i10;
    }

    @Override
    public final g2 r() {
        return new o0(t().iterator());
    }

    public abstract t0 s();

    public final t0 t() {
        t0 t0Var = this.f10330c;
        if (t0Var == null) {
            if (isEmpty()) {
                t0Var = z1.f10366s;
            } else {
                t0Var = new q0(this, 0);
            }
            this.f10330c = t0Var;
        }
        return t0Var;
    }

    @Override
    public final String toString() {
        return t().toString();
    }
}
