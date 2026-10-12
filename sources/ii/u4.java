package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class u4 extends t61 {
    public static final int f12734a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.u61 r3, boolean r4, org.telegram.ui.Components.h71 r5, org.telegram.ui.Components.p71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.u4.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.h71, org.telegram.ui.Components.p71):void");
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        v4 v4Var = new v4(context, c6Var);
        v4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var)));
        return v4Var;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
