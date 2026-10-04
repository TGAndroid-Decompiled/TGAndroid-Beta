package ei;
public final class a0 extends org.telegram.ui.ActionBar.d5 {
    public final d0 f8906p;

    public a0(d0 d0Var) {
        this.f8906p = d0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f8906p.invalidate();
    }
}
