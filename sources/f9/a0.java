package f9;

import java.util.Collection;
public abstract class a0 extends l0 {
    @Override
    public final d0 d() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final d0 e() {
        r1 r1Var = ((r1) this).f10334n;
        t0 t0Var = r1Var.f10298b;
        if (t0Var == null) {
            v1 c10 = r1Var.c();
            r1Var.f10298b = c10;
            return c10;
        }
        return t0Var;
    }

    @Override
    public final Collection values() {
        r1 r1Var = ((r1) this).f10334n;
        t0 t0Var = r1Var.f10298b;
        if (t0Var == null) {
            v1 c10 = r1Var.c();
            r1Var.f10298b = c10;
            return c10;
        }
        return t0Var;
    }
}
