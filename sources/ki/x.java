package ki;

import org.telegram.ui.ActionBar.p4;
public final class x extends p4 {
    public final a0 f18639p;

    public x(a0 a0Var) {
        this.f18639p = a0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f18639p.invalidate();
    }
}
