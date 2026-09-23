package m4;

import gg.d2;
public final class u0 implements a1 {
    public final int f14684a;
    public final a1 f14685b;

    public u0(a1 a1Var, int i10) {
        this.f14684a = i10;
        this.f14685b = a1Var;
    }

    @Override
    public final Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f14684a) {
            case 0:
                if (a0Var == null) {
                    b1.I0(null, rVar, i10, this.f14685b, new i2.s(rVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return b1.I0(a0Var, rVar, i10, this.f14685b, new d2(a0Var, rVar, i10, 4));
        }
    }
}
