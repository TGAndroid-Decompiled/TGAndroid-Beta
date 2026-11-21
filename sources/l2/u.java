package l2;
public final class u implements h2.o {
    public final int f19574a;
    public final f0 f19575b;

    public u(f0 f0Var, int i7) {
        this.f19574a = i7;
        this.f19575b = f0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f19574a) {
            case 2:
                a1Var.O(this.f19575b.P);
                return;
            default:
                a1Var.n(this.f19575b.R);
                return;
        }
    }
}
