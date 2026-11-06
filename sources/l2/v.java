package l2;
public final class v implements h2.o {
    public final int f18062a;
    public final i0 f18063b;

    public v(i0 i0Var, int i7) {
        this.f18062a = i7;
        this.f18063b = i0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f18062a) {
            case 2:
                a1Var.O(this.f18063b.P);
                return;
            default:
                a1Var.n(this.f18063b.R);
                return;
        }
    }
}
