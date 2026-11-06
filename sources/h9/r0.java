package h9;

import j$.util.Collection;
import java.util.Arrays;
public abstract class r0 extends d0 implements n1, Collection {
    public static final int d = 0;
    public transient t1 f14380b;
    public transient t0 f14381c;

    @Override
    public final boolean contains(Object obj) {
        if (((z1) this).f14423e.b(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n1) {
                n1 n1Var = (n1) obj;
                z1 z1Var = (z1) this;
                if (z1Var.size() == n1Var.size()) {
                    r0 r0Var = (r0) n1Var;
                    if (p().size() == r0Var.p().size()) {
                        for (p1 p1Var : r0Var.p()) {
                            if (z1Var.f14423e.b(p1Var.f14365a) != p1Var.a()) {
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
        t1 t1Var = this.f14380b;
        if (t1Var == null) {
            i0 f10 = super.f();
            this.f14380b = (t1) f10;
            return f10;
        }
        return t1Var;
    }

    @Override
    public final int hashCode() {
        return o.o(p());
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        h2 it = p().iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            Arrays.fill(objArr, i7, p1Var.a() + i7, p1Var.f14365a);
            i7 += p1Var.a();
        }
        return i7;
    }

    @Override
    public final h2 n() {
        return new o0(p().iterator());
    }

    public abstract t0 o();

    public final t0 p() {
        t0 t0Var = this.f14381c;
        if (t0Var == null) {
            if (isEmpty()) {
                t0Var = a2.f14288s;
            } else {
                t0Var = new q0(this, 0);
            }
            this.f14381c = t0Var;
        }
        return t0Var;
    }

    @Override
    public final String toString() {
        return p().toString();
    }
}
