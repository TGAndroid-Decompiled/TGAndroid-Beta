package defpackage;
public final class bq0 extends a27 {
    public final eq0 p;

    public bq0(eq0 eq0Var) {
        this.p = eq0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
