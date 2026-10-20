package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class p0 extends g61 {
    public static final int f5710a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((q0) view).set((v0) h61Var.G);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        q0 q0Var = new q0(i10, context, false);
        q0Var.setLayoutParams(new s4.o0(-2, -2));
        return q0Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.G == h61Var2.G) {
            return true;
        }
        return false;
    }
}
