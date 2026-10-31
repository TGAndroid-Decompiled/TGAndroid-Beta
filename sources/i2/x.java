package i2;
public final class x implements e2.o {
    public final int f8113a;
    public final i0 f8114b;

    public x(i0 i0Var, int i10) {
        this.f8113a = i10;
        this.f8114b = i0Var;
    }

    @Override
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.f8113a) {
            case 2:
                d1Var.p(this.f8114b.P);
                return;
            default:
                d1Var.i(this.f8114b.R);
                return;
        }
    }
}
