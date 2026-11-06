package h9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class j0 extends m implements a1, Serializable {
    public final transient y1 f14333e;
    public final transient int f14334f;

    public j0(y1 y1Var, int i7) {
        this.f14333e = y1Var;
        this.f14334f = i7;
    }

    @Override
    public final Collection a() {
        return (d0) super.a();
    }

    @Override
    public final boolean c(Object obj) {
        if (obj != null && super.c(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final Collection e() {
        return new n0(this);
    }

    @Override
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override
    public final Iterator g() {
        return new m0(this);
    }

    @Override
    public final Collection get(Object obj) {
        i0 i0Var = (i0) this.f14333e.get(obj);
        if (i0Var == null) {
            g0 g0Var = i0.f14329b;
            return t1.f14397e;
        }
        return i0Var;
    }

    @Override
    public l0 b() {
        return this.f14333e;
    }

    @Override
    public final Set keySet() {
        y1 y1Var = this.f14333e;
        t0 t0Var = y1Var.f14343b;
        if (t0Var == null) {
            w1 d = y1Var.d();
            y1Var.f14343b = d;
            return d;
        }
        return t0Var;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.f14334f;
    }
}
