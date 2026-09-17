package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class y0 extends g51 {
    public static final int f4006a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((z0) view).set((e1) h51Var.G);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        z0 z0Var = new z0(i10, context, false);
        z0Var.setLayoutParams(new s4.p0(-2, -2));
        return z0Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.G == h51Var2.G) {
            return true;
        }
        return false;
    }
}
