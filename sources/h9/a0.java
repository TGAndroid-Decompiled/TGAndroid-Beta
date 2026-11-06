package h9;

import java.util.Collection;
public abstract class a0 extends l0 {
    @Override
    public final d0 e() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final d0 f() {
        s1 s1Var = ((s1) this).f14393n;
        t0 t0Var = s1Var.f14343b;
        if (t0Var == null) {
            w1 d = s1Var.d();
            s1Var.f14343b = d;
            return d;
        }
        return t0Var;
    }

    @Override
    public final Collection values() {
        s1 s1Var = ((s1) this).f14393n;
        t0 t0Var = s1Var.f14343b;
        if (t0Var == null) {
            w1 d = s1Var.d();
            s1Var.f14343b = d;
            return d;
        }
        return t0Var;
    }
}
