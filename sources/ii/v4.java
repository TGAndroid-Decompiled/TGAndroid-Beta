package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class v4 extends q61 {
    public static final int f12751a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.r61 r3, boolean r4, org.telegram.ui.Components.e71 r5, org.telegram.ui.Components.m71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.v4.bindView(android.view.View, org.telegram.ui.Components.r61, boolean, org.telegram.ui.Components.e71, org.telegram.ui.Components.m71):void");
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        w4 w4Var = new w4(context, d6Var);
        w4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, d6Var)));
        return w4Var;
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
