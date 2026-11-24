package defpackage;
public final class hg1 extends m8 {
    public final vg1 o;

    public hg1(vg1 vg1Var, gg1 gg1Var) {
        super(gg1Var, -2, -2);
        this.o = vg1Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        vg1 vg1Var = this.o;
        if (vg1Var.G0 != this) {
            return;
        }
        u31.e();
        vg1Var.G0 = null;
    }
}
