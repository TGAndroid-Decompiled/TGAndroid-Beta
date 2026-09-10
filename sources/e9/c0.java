package e9;

import java.util.Collection;
public abstract class c0 extends k0 {
    @Override
    public final d0 d() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final d0 e() {
        z0 z0Var = ((z0) this).f7451n;
        m0 m0Var = z0Var.f7393b;
        if (m0Var == null) {
            d1 c10 = z0Var.c();
            z0Var.f7393b = c10;
            return c10;
        }
        return m0Var;
    }

    @Override
    public final Collection values() {
        z0 z0Var = ((z0) this).f7451n;
        m0 m0Var = z0Var.f7393b;
        if (m0Var == null) {
            d1 c10 = z0Var.c();
            z0Var.f7393b = c10;
            return c10;
        }
        return m0Var;
    }
}
