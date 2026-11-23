package l2;
public final class u implements h2.o {
    public final int f19577a;
    public final f0 f19578b;

    public u(f0 f0Var, int i7) {
        this.f19577a = i7;
        this.f19578b = f0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f19577a) {
            case 2:
                a1Var.O(this.f19578b.P);
                return;
            default:
                a1Var.n(this.f19578b.R);
                return;
        }
    }
}
