package defpackage;
public final class nc1 extends ho {
    public final byte e0;
    public final oc1 f0;

    public nc1(oc1 oc1Var, byte b) {
        super(true, false, false);
        this.e0 = b;
        this.f0 = oc1Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        oc1 oc1Var = this.f0;
        switch (b) {
            case 0:
                oc1Var.invalidateSelf();
                return;
            default:
                oc1Var.invalidateSelf();
                return;
        }
    }
}
