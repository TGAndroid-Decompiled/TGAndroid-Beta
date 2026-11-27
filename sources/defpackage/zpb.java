package defpackage;
public final class zpb extends pqb {
    public final zu1 m2;
    public final boolean n2;

    public zpb(Object obj, zu1 zu1Var, boolean z) {
        super(obj, null, true);
        this.m2 = zu1Var;
        this.n2 = z;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xu1 xu1Var = this.m2.Ba;
        xu1Var.q(xu1Var.f, xu1Var.g, false, Boolean.valueOf(this.n2), false);
    }
}
