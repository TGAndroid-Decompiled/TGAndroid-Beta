package defpackage;
public final class woc extends vx4 {
    public final dl1 E;

    public woc(dl1 dl1Var, dl1 dl1Var2) {
        super(dl1Var, 1.0f);
        this.E = dl1Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
