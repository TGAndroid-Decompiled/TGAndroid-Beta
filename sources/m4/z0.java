package m4;
public final class z0 implements h1 {
    public final int f13002a;
    public final h1 f13003b;

    public z0(h1 h1Var, int i10) {
        this.f13002a = i10;
        this.f13003b = h1Var;
    }

    @Override
    public final Object f(f0 f0Var, w wVar, int i10) {
        switch (this.f13002a) {
            case 0:
                if (f0Var == null) {
                    j1.K0(null, wVar, i10, this.f13003b, new i2.q(wVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return j1.K0(f0Var, wVar, i10, this.f13003b, new ag.b0(f0Var, wVar, i10, 3));
        }
    }
}
