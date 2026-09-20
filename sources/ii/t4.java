package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class t4 extends v51 {
    public static final int f11636a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.w51 r3, boolean r4, org.telegram.ui.Components.k61 r5, org.telegram.ui.Components.s61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.t4.bindView(android.view.View, org.telegram.ui.Components.w51, boolean, org.telegram.ui.Components.k61, org.telegram.ui.Components.s61):void");
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        u4 u4Var = new u4(context, f6Var);
        u4Var.setBackground(new a2(j6.v0(j6.f19094d6, f6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
