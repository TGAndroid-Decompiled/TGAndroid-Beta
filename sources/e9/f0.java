package e9;

import java.util.Collection;
public abstract class f0 extends q0 {
    @Override
    public final i0 d() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final i0 e() {
        w1 w1Var = ((w1) this).f8529n;
        y0 y0Var = w1Var.f8490b;
        if (y0Var == null) {
            a2 c10 = w1Var.c();
            w1Var.f8490b = c10;
            return c10;
        }
        return y0Var;
    }

    @Override
    public final Collection values() {
        w1 w1Var = ((w1) this).f8529n;
        y0 y0Var = w1Var.f8490b;
        if (y0Var == null) {
            a2 c10 = w1Var.c();
            w1Var.f8490b = c10;
            return c10;
        }
        return y0Var;
    }
}
