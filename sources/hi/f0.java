package hi;

import org.telegram.ui.ActionBar.k5;
public final class f0 extends k5 {
    public final i0 f12962p;

    public f0(i0 i0Var) {
        this.f12962p = i0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f12962p.invalidate();
    }
}
