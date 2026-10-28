package f9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class j0 extends m implements a1, Serializable {
    public final transient x1 e;
    public final transient int f10287f;

    public j0(x1 x1Var, int i10) {
        this.e = x1Var;
        this.f10287f = i10;
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
        i0 i0Var = (i0) this.e.get(obj);
        if (i0Var == null) {
            g0 g0Var = i0.f10286b;
            return s1.e;
        }
        return i0Var;
    }

    @Override
    public l0 b() {
        return this.e;
    }

    @Override
    public final Set keySet() {
        x1 x1Var = this.e;
        t0 t0Var = x1Var.f10297b;
        if (t0Var == null) {
            v1 c10 = x1Var.c();
            x1Var.f10297b = c10;
            return c10;
        }
        return t0Var;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.f10287f;
    }
}
