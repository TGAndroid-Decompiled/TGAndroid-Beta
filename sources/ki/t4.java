package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
public final class t4 extends g61 {
    public static final int f15530a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.h61 r3, boolean r4, org.telegram.ui.Components.u61 r5, org.telegram.ui.Components.c71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ki.t4.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.u61, org.telegram.ui.Components.c71):void");
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        u4 u4Var = new u4(context, d6Var);
        u4Var.setBackground(new a2(h6.w0(h6.f20990d6, d6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
