package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class o0 extends q implements f1, Serializable {
    public final transient c2 e;
    public final transient int f8480f;

    public o0(c2 c2Var, int i10) {
        this.e = c2Var;
        this.f8480f = i10;
    }

    @Override
    public final Collection a() {
        return (i0) super.a();
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
        return new s0(this);
    }

    @Override
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override
    public final Iterator g() {
        return new r0(this);
    }

    @Override
    public final Collection get(Object obj) {
        n0 n0Var = (n0) this.e.get(obj);
        if (n0Var == null) {
            l0 l0Var = n0.f8477b;
            return x1.e;
        }
        return n0Var;
    }

    @Override
    public q0 b() {
        return this.e;
    }

    @Override
    public final Set keySet() {
        c2 c2Var = this.e;
        y0 y0Var = c2Var.f8490b;
        if (y0Var == null) {
            a2 c10 = c2Var.c();
            c2Var.f8490b = c10;
            return c10;
        }
        return y0Var;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.f8480f;
    }
}
