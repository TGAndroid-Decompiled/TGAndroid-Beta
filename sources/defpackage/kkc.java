package defpackage;
public final class kkc extends qv4 {
    public final uk1 E;

    public kkc(uk1 uk1Var, uk1 uk1Var2) {
        super(uk1Var, 1.0f);
        this.E = uk1Var2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
