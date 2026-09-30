package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class u4 extends x51 {
    public static final int f11669a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.y51 r3, boolean r4, org.telegram.ui.Components.m61 r5, org.telegram.ui.Components.u61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.u4.bindView(android.view.View, org.telegram.ui.Components.y51, boolean, org.telegram.ui.Components.m61, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        v4 v4Var = new v4(context, d6Var);
        v4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var)));
        return v4Var;
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
