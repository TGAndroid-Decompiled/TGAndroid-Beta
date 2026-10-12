package ei;
public final class z extends org.telegram.ui.ActionBar.c5 {
    public final c0 f9510p;

    public z(c0 c0Var) {
        this.f9510p = c0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f9510p.invalidate();
    }
}
