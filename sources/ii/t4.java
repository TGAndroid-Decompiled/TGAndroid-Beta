package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class t4 extends x51 {
    public static final int f11636a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.y51 r3, boolean r4, org.telegram.ui.Components.m61 r5, org.telegram.ui.Components.u61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.t4.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        u4 u4Var = new u4(context, f6Var);
        u4Var.setBackground(new a2(j6.v0(j6.f19109d6, f6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
