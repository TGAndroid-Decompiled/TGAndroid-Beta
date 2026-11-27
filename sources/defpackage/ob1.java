package defpackage;
public final class ob1 extends hn {
    public final byte e0;
    public final pb1 f0;

    public ob1(pb1 pb1Var, byte b) {
        super(true, false, false);
        this.e0 = b;
        this.f0 = pb1Var;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        pb1 pb1Var = this.f0;
        switch (b) {
            case 0:
                pb1Var.invalidateSelf();
                return;
            default:
                pb1Var.invalidateSelf();
                return;
        }
    }
}
