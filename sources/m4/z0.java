package m4;

import hg.b2;
public final class z0 implements g1 {
    public final int f16784a;
    public final g1 f16785b;

    public z0(g1 g1Var, int i10) {
        this.f16784a = i10;
        this.f16785b = g1Var;
    }

    @Override
    public final Object e(f0 f0Var, v vVar, int i10) {
        switch (this.f16784a) {
            case 0:
                if (f0Var == null) {
                    i1.I0(null, vVar, i10, this.f16785b, new i2.r(vVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return i1.I0(f0Var, vVar, i10, this.f16785b, new b2(f0Var, vVar, i10, 4));
        }
    }
}
