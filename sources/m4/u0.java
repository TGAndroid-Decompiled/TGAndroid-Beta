package m4;

import gg.c2;
public final class u0 implements a1 {
    public final int f16242a;
    public final a1 f16243b;

    public u0(a1 a1Var, int i10) {
        this.f16242a = i10;
        this.f16243b = a1Var;
    }

    @Override
    public final Object h(b0 b0Var, r rVar, int i10) {
        switch (this.f16242a) {
            case 0:
                if (b0Var == null) {
                    b1.H0(null, rVar, i10, this.f16243b, new i2.s(rVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return b1.H0(b0Var, rVar, i10, this.f16243b, new c2(b0Var, rVar, i10, 4));
        }
    }
}
