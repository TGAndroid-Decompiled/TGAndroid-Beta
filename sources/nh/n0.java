package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class n0 extends h51 {
    public static final int f15652a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((o0) view).set((t0) i51Var.G);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        o0 o0Var = new o0(i10, context, false);
        o0Var.setLayoutParams(new f2.w0(-2, -2));
        return o0Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.G == i51Var2.G) {
            return true;
        }
        return false;
    }
}
