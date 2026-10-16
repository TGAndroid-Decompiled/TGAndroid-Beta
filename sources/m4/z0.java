package m4;

import hg.b2;
public final class z0 implements g1 {
    public final int f15425a;
    public final g1 f15426b;

    public z0(g1 g1Var, int i10) {
        this.f15425a = i10;
        this.f15426b = g1Var;
    }

    @Override
    public final Object c(e0 e0Var, v vVar, int i10) {
        switch (this.f15425a) {
            case 0:
                if (e0Var == null) {
                    i1.I0(null, vVar, i10, this.f15426b, new i2.r(vVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return i1.I0(e0Var, vVar, i10, this.f15426b, new b2(e0Var, vVar, i10, 4));
        }
    }
}
