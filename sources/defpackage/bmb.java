package defpackage;
public final class bmb implements imb {
    public boolean a;
    public final mu1 b;

    public bmb(mu1 mu1Var, boolean z) {
        this.b = mu1Var;
        this.a = z;
    }

    @Override
    public final void E(boolean z) {
        boolean z2 = !this.a;
        this.a = z2;
        ku1 ku1Var = this.b.Ba;
        ku1Var.q(ku1Var.f, ku1Var.g, z, Boolean.valueOf(z2), false);
    }

    @Override
    public final boolean a() {
        return this.a;
    }

    @Override
    public final boolean w() {
        return true;
    }
}
