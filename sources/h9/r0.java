package h9;

import j$.util.Collection;
import java.util.Arrays;
public abstract class r0 extends d0 implements m1, Collection {
    public static final int d = 0;
    public transient s1 f14044b;
    public transient t0 f14045c;

    @Override
    public final boolean contains(Object obj) {
        if (((y1) this).f14085e.b(obj) > 0) {
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
                    if (p().size() == r0Var.p().size()) {
                        for (o1 o1Var : r0Var.p()) {
                            if (y1Var.f14085e.b(o1Var.f14026a) != o1Var.a()) {
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
    public final i0 f() {
        s1 s1Var = this.f14044b;
        if (s1Var == null) {
            i0 f10 = super.f();
            this.f14044b = (s1) f10;
            return f10;
        }
        return s1Var;
    }

    @Override
    public final int hashCode() {
        return o.o(p());
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        g2 it = p().iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            Arrays.fill(objArr, i7, o1Var.a() + i7, o1Var.f14026a);
            i7 += o1Var.a();
        }
        return i7;
    }

    @Override
    public final g2 n() {
        return new o0(p().iterator());
    }

    public abstract t0 o();

    public final t0 p() {
        t0 t0Var = this.f14045c;
        if (t0Var == null) {
            if (isEmpty()) {
                t0Var = z1.f14090s;
            } else {
                t0Var = new q0(this, 0);
            }
            this.f14045c = t0Var;
        }
        return t0Var;
    }

    @Override
    public final String toString() {
        return p().toString();
    }
}
