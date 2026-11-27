package defpackage;
public final class t7 extends hn {
    public final byte e0;
    public final x7 f0;

    public t7(x7 x7Var, byte b) {
        super(false, true, true);
        this.e0 = b;
        this.f0 = x7Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        x7 x7Var = this.f0;
        switch (b) {
            case 0:
                x7Var.invalidate();
                return;
            default:
                x7Var.invalidate();
                return;
        }
    }
}
