package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class t4 extends t61 {
    public static final int f17498a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.u61 r3, boolean r4, org.telegram.ui.Components.k71 r5, org.telegram.ui.Components.s71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: li.t4.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.k71, org.telegram.ui.Components.s71):void");
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        u4 u4Var = new u4(context, u6Var);
        u4Var.setBackground(new y1(y6.w0(y6.f23357d6, u6Var)));
        return u4Var;
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
