package defpackage;

import android.view.View;
public final class y66 extends gb3 {
    public final l18 F;

    public y66(l18 l18Var) {
        this.F = l18Var;
    }

    @Override
    public final float A(View view) {
        return 0.5f;
    }

    @Override
    public final void M() {
        this.F.c.invalidate();
    }

    @Override
    public final void P(s49 s49Var) {
        this.F.c.invalidate();
    }
}
