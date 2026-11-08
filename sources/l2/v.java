package l2;
public final class v implements h2.o {
    public final int f18065a;
    public final i0 f18066b;

    public v(i0 i0Var, int i7) {
        this.f18065a = i7;
        this.f18066b = i0Var;
    }

    @Override
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.f18065a) {
            case 2:
                a1Var.O(this.f18066b.P);
                return;
            default:
                a1Var.n(this.f18066b.R);
                return;
        }
    }
}
