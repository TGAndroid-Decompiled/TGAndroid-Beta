package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.zl0;
public final class v4 extends g61 {
    public static final int f12705a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.h61 r3, boolean r4, org.telegram.ui.Components.w61 r5, org.telegram.ui.Components.e71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.v4.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.w61, org.telegram.ui.Components.e71):void");
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        w4 w4Var = new w4(context, d6Var);
        w4Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var)));
        return w4Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
