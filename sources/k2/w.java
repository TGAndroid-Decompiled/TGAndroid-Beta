package k2;
public final class w implements g2.p {
    public final int f16756a;
    public final i0 f16757b;

    public w(i0 i0Var, int i3) {
        this.f16756a = i3;
        this.f16757b = i0Var;
    }

    @Override
    public void invoke(Object obj) {
        d2.c1 c1Var = (d2.c1) obj;
        switch (this.f16756a) {
            case 2:
                c1Var.N(this.f16757b.P);
                return;
            default:
                c1Var.C(this.f16757b.R);
                return;
        }
    }
}
