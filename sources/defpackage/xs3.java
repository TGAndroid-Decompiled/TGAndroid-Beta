package defpackage;
public final class xs3 extends gn {
    public final byte e0;
    public final gt3 f0;

    public xs3(gt3 gt3Var, byte b) {
        super(false, false, false);
        this.e0 = b;
        this.f0 = gt3Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        gt3 gt3Var = this.f0;
        switch (b) {
            case 0:
                gt3Var.invalidate();
                return;
            default:
                gt3Var.invalidate();
                return;
        }
    }
}
