package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class g1 extends o61 {
    public static final int f1046a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((h1) view).set((m1) p61Var.G);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        h1 h1Var = new h1(i10, context, false);
        h1Var.setLayoutParams(new s4.q0(-2, -2));
        return h1Var;
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.G == p61Var2.G) {
            return true;
        }
        return false;
    }
}
