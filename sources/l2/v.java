package l2;
public final class v implements h2.o {
    public final int f18066a;
    public final i0 f18067b;

    public v(i0 i0Var, int i7) {
        this.f18066a = i7;
        this.f18067b = i0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f18066a) {
            case 2:
                a1Var.O(this.f18067b.P);
                return;
            default:
                a1Var.n(this.f18067b.R);
                return;
        }
    }
}
