package m4;

import gg.d2;
public final class t0 implements z0 {
    public final int f14932a;
    public final z0 f14933b;

    public t0(z0 z0Var, int i10) {
        this.f14932a = i10;
        this.f14933b = z0Var;
    }

    @Override
    public final Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f14932a) {
            case 0:
                if (a0Var == null) {
                    a1.I0(null, rVar, i10, this.f14933b, new i2.s(rVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return a1.I0(a0Var, rVar, i10, this.f14933b, new d2(a0Var, rVar, i10, 4));
        }
    }
}
