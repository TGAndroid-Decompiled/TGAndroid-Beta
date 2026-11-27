package defpackage;
public final class aqb implements hqb {
    public boolean a;
    public final zu1 b;

    public aqb(zu1 zu1Var, boolean z) {
        this.b = zu1Var;
        this.a = z;
    }

    @Override
    public final boolean a() {
        return this.a;
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final void w(boolean z) {
        boolean z2 = !this.a;
        this.a = z2;
        xu1 xu1Var = this.b.Ba;
        xu1Var.q(xu1Var.f, xu1Var.g, z, Boolean.valueOf(z2), false);
    }
}
