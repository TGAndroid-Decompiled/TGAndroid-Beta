package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
public final class t4 extends i51 {
    public static final int f11635a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.j51 r3, boolean r4, org.telegram.ui.Components.x51 r5, org.telegram.ui.Components.f61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.t4.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.f61):void");
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        u4 u4Var = new u4(context, f6Var);
        u4Var.setBackground(new a2(j6.v0(j6.f18862d6, f6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
