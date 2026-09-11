package fi;
public final class z extends org.telegram.ui.ActionBar.e5 {
    public final c0 f10123p;

    public z(c0 c0Var) {
        this.f10123p = c0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f10123p.invalidate();
    }
}
