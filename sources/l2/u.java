package l2;
public final class u implements h2.o {
    public final int f19549a;
    public final f0 f19550b;

    public u(f0 f0Var, int i7) {
        this.f19549a = i7;
        this.f19550b = f0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f19549a) {
            case 2:
                a1Var.O(this.f19550b.P);
                return;
            default:
                a1Var.n(this.f19550b.R);
                return;
        }
    }
}
