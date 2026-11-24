package defpackage;
public final class hu3 extends ho {
    public final byte e0;
    public final qu3 f0;

    public hu3(qu3 qu3Var, byte b) {
        super(false, false, false);
        this.e0 = b;
        this.f0 = qu3Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        qu3 qu3Var = this.f0;
        switch (b) {
            case 0:
                qu3Var.invalidate();
                return;
            default:
                qu3Var.invalidate();
                return;
        }
    }
}
