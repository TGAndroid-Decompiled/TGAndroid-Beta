package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
public final class v4 extends g51 {
    public static final int f14276a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.h51 r3, boolean r4, org.telegram.ui.Components.v51 r5, org.telegram.ui.Components.d61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v4.bindView(android.view.View, org.telegram.ui.Components.h51, boolean, org.telegram.ui.Components.v51, org.telegram.ui.Components.d61):void");
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        w4 w4Var = new w4(context, f6Var);
        w4Var.setBackground(new z1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var)));
        return w4Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
