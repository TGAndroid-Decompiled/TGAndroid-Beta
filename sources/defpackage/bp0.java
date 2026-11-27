package defpackage;
public final class bp0 extends h27 {
    public final ep0 p;

    public bp0(ep0 ep0Var) {
        this.p = ep0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
