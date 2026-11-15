package l2;
public final class u implements h2.o {
    public final int f19182a;
    public final f0 f19183b;

    public u(f0 f0Var, int i7) {
        this.f19182a = i7;
        this.f19183b = f0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f19182a) {
            case 2:
                a1Var.O(this.f19183b.P);
                return;
            default:
                a1Var.m(this.f19183b.R);
                return;
        }
    }
}
