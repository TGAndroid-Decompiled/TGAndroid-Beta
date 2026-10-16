package fi;
public final class y extends org.telegram.ui.ActionBar.c5 {
    public final b0 f9672p;

    public y(b0 b0Var) {
        this.f9672p = b0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f9672p.invalidate();
    }
}
