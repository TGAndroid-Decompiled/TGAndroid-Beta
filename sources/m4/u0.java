package m4;

import gg.c2;
public final class u0 implements b1 {
    public final int f16299a;
    public final b1 f16300b;

    public u0(b1 b1Var, int i10) {
        this.f16299a = i10;
        this.f16300b = b1Var;
    }

    @Override
    public final Object h(b0 b0Var, r rVar, int i10) {
        switch (this.f16299a) {
            case 0:
                if (b0Var == null) {
                    c1.H0(null, rVar, i10, this.f16300b, new i2.s(rVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return c1.H0(b0Var, rVar, i10, this.f16300b, new c2(b0Var, rVar, i10, 4));
        }
    }
}
