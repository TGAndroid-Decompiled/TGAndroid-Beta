package mh;

import org.telegram.ui.ActionBar.c5;
public final class z extends c5 {
    public final c0 f18233p;

    public z(c0 c0Var) {
        this.f18233p = c0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f18233p.invalidate();
    }
}
