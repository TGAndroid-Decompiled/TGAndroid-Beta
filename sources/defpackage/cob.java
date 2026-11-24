package defpackage;
public final class cob implements job {
    public boolean a;
    public final yv1 b;

    public cob(yv1 yv1Var, boolean z) {
        this.b = yv1Var;
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
        wv1 wv1Var = this.b.Ba;
        wv1Var.q(wv1Var.f, wv1Var.g, z, Boolean.valueOf(z2), false);
    }
}
