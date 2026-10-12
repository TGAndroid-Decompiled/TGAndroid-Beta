package m4;

import gg.c2;
public final class v0 implements b1 {
    public final int f15991a;
    public final b1 f15992b;

    public v0(b1 b1Var, int i10) {
        this.f15991a = i10;
        this.f15992b = b1Var;
    }

    @Override
    public final Object h(c0 c0Var, r rVar, int i10) {
        switch (this.f15991a) {
            case 0:
                if (c0Var == null) {
                    c1.H0(null, rVar, i10, this.f15992b, new i2.s(rVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return c1.H0(c0Var, rVar, i10, this.f15992b, new c2(c0Var, rVar, i10, 4));
        }
    }
}
