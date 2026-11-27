package defpackage;
public final class pt3 extends hn {
    public final byte e0;
    public final xt3 f0;

    public pt3(xt3 xt3Var, byte b) {
        super(false, false, false);
        this.e0 = b;
        this.f0 = xt3Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        xt3 xt3Var = this.f0;
        switch (b) {
            case 0:
                xt3Var.invalidate();
                return;
            default:
                xt3Var.invalidate();
                return;
        }
    }
}
