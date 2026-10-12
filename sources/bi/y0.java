package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class y0 extends k61 {
    public static final int f4000a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((z0) view).set((e1) l61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        z0 z0Var = new z0(i10, context, false);
        z0Var.setLayoutParams(new s4.o0(-2, -2));
        return z0Var;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.G == l61Var2.G) {
            return true;
        }
        return false;
    }
}
