package g9;

import java.util.Collection;
public abstract class a0 extends l0 {
    @Override
    public final d0 e() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final d0 f() {
        r1 r1Var = ((r1) this).f12137n;
        t0 t0Var = r1Var.f12097b;
        if (t0Var == null) {
            v1 d = r1Var.d();
            r1Var.f12097b = d;
            return d;
        }
        return t0Var;
    }

    @Override
    public final Collection values() {
        r1 r1Var = ((r1) this).f12137n;
        t0 t0Var = r1Var.f12097b;
        if (t0Var == null) {
            v1 d = r1Var.d();
            r1Var.f12097b = d;
            return d;
        }
        return t0Var;
    }
}
