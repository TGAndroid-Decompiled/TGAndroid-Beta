package ii;

import org.telegram.ui.ActionBar.r4;
public final class x extends r4 {
    public final a0 f15309p;

    public x(a0 a0Var) {
        this.f15309p = a0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f15309p.invalidate();
    }
}
