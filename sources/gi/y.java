package gi;

import org.telegram.ui.ActionBar.e5;
public final class y extends e5 {
    public final b0 f11548p;

    public y(b0 b0Var) {
        this.f11548p = b0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f11548p.invalidate();
    }
}
