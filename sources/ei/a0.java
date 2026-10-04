package ei;
public final class a0 extends org.telegram.ui.ActionBar.d5 {
    public final d0 f8907p;

    public a0(d0 d0Var) {
        this.f8907p = d0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f8907p.invalidate();
    }
}
