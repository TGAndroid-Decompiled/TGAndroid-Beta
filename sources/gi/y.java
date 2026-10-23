package gi;

import org.telegram.ui.ActionBar.i5;
public final class y extends i5 {
    public final b0 f11574p;

    public y(b0 b0Var) {
        this.f11574p = b0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f11574p.invalidate();
    }
}
