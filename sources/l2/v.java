package l2;
public final class v implements h2.o {
    public final int f19647a;
    public final g0 f19648b;

    public v(g0 g0Var, int i7) {
        this.f19647a = i7;
        this.f19648b = g0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f19647a) {
            case 2:
                a1Var.O(this.f19648b.P);
                return;
            default:
                a1Var.n(this.f19648b.R);
                return;
        }
    }
}
