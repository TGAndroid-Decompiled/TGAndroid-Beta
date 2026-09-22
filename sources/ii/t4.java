package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
public final class t4 extends h51 {
    public static final int f11634a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.i51 r3, boolean r4, org.telegram.ui.Components.w51 r5, org.telegram.ui.Components.e61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.t4.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.e61):void");
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        u4 u4Var = new u4(context, e6Var);
        u4Var.setBackground(new a2(i6.v0(i6.f18834d6, e6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
