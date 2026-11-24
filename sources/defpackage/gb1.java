package defpackage;
public final class gb1 extends gn {
    public final byte e0;
    public final hb1 f0;

    public gb1(hb1 hb1Var, byte b) {
        super(true, false, false);
        this.e0 = b;
        this.f0 = hb1Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        hb1 hb1Var = this.f0;
        switch (b) {
            case 0:
                hb1Var.invalidateSelf();
                return;
            default:
                hb1Var.invalidateSelf();
                return;
        }
    }
}
