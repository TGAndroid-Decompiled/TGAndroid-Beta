package nh;

import org.telegram.ui.ActionBar.c5;

public final class x extends c5 {

    public final a0 f19025p;

    public x(a0 a0Var) {
        this.f19025p = a0Var;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f19025p.invalidate();
    }
}
