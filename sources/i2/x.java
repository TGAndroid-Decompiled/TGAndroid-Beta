package i2;
public final class x implements e2.o {
    public final int f8114a;
    public final i0 f8115b;

    public x(i0 i0Var, int i10) {
        this.f8114a = i10;
        this.f8115b = i0Var;
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f8114a) {
            case 2:
                d1Var.p(this.f8115b.P);
                return;
            default:
                d1Var.i(this.f8115b.R);
                return;
        }
    }
}
