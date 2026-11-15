package h9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class j0 extends m implements a1, Serializable {
    public final transient x1 f13688e;
    public final transient int f13689f;

    public j0(x1 x1Var, int i7) {
        this.f13688e = x1Var;
        this.f13689f = i7;
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
        i0 i0Var = (i0) this.f13688e.get(obj);
        if (i0Var == null) {
            g0 g0Var = i0.f13686b;
            return s1.f13749e;
        }
        return i0Var;
    }

    @Override
    public l0 b() {
        return this.f13688e;
    }

    @Override
    public final Set keySet() {
        x1 x1Var = this.f13688e;
        t0 t0Var = x1Var.f13700b;
        if (t0Var == null) {
            v1 d = x1Var.d();
            x1Var.f13700b = d;
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
        return this.f13689f;
    }
}
