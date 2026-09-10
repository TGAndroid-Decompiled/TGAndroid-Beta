package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class w4 extends u51 {
    public static final int f9928a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.v51 r3, boolean r4, org.telegram.ui.Components.j61 r5, org.telegram.ui.Components.r61 r6) {
        throw new UnsupportedOperationException("Method not decompiled: hi.w4.bindView(android.view.View, org.telegram.ui.Components.v51, boolean, org.telegram.ui.Components.j61, org.telegram.ui.Components.r61):void");
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        x4 x4Var = new x4(context, f6Var);
        x4Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
        return x4Var;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
