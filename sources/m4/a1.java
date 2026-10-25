package m4;
public final class a1 implements h1 {
    public final int f17999a;
    public final h1 f18000b;

    public a1(h1 h1Var, int i10) {
        this.f17999a = i10;
        this.f18000b = h1Var;
    }

    @Override
    public final Object c(f0 f0Var, w wVar, int i10) {
        switch (this.f17999a) {
            case 0:
                if (f0Var == null) {
                    j1.I0(null, wVar, i10, this.f18000b, new i2.r(wVar, i10, 3));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return j1.I0(f0Var, wVar, i10, this.f18000b, new i2.z(f0Var, wVar, i10, 4));
        }
    }
}
