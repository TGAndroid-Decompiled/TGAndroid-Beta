package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class u4 extends w51 {
    public static final int f11655a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.x51 r3, boolean r4, org.telegram.ui.Components.l61 r5, org.telegram.ui.Components.t61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.u4.bindView(android.view.View, org.telegram.ui.Components.x51, boolean, org.telegram.ui.Components.l61, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        v4 v4Var = new v4(context, d6Var);
        v4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var)));
        return v4Var;
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
