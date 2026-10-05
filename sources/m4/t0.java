package m4;

import gg.d2;
public final class t0 implements z0 {
    public final int f16304a;
    public final z0 f16305b;

    public t0(z0 z0Var, int i10) {
        this.f16304a = i10;
        this.f16305b = z0Var;
    }

    @Override
    public final Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f16304a) {
            case 0:
                if (a0Var == null) {
                    a1.I0(null, rVar, i10, this.f16305b, new i2.s(rVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return a1.I0(a0Var, rVar, i10, this.f16305b, new d2(a0Var, rVar, i10, 4));
        }
    }
}
