package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class t4 extends w51 {
    public static final int f11635a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.x51 r3, boolean r4, org.telegram.ui.Components.l61 r5, org.telegram.ui.Components.t61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.t4.bindView(android.view.View, org.telegram.ui.Components.x51, boolean, org.telegram.ui.Components.l61, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        u4 u4Var = new u4(context, e6Var);
        u4Var.setBackground(new a2(j6.v0(j6.f19062d6, e6Var)));
        return u4Var;
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
