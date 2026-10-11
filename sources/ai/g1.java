package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class g1 extends q61 {
    public static final int f1046a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        ((h1) view).set((m1) r61Var.G);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h1 h1Var = new h1(i10, context, false);
        h1Var.setLayoutParams(new s4.q0(-2, -2));
        return h1Var;
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.G == r61Var2.G) {
            return true;
        }
        return false;
    }
}
