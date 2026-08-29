package cg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
public final class g0 extends d1 {
    public final v0 L;

    public g0(v0 v0Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.L = v0Var;
    }

    @Override
    public final void invalidate() {
        if (this.L.f3402b0) {
            return;
        }
        super.invalidate();
    }
}
