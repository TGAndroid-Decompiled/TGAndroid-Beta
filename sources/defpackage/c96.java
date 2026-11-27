package defpackage;

import android.view.View;
public final class c96 extends zb3 {
    public final c58 F;

    public c96(c58 c58Var) {
        this.F = c58Var;
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
    public final void P(f89 f89Var) {
        this.F.c.invalidate();
    }
}
