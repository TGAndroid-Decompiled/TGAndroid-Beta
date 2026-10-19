package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
public final class t4 extends f61 {
    public static final int f15532a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.g61 r3, boolean r4, org.telegram.ui.Components.t61 r5, org.telegram.ui.Components.b71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ki.t4.bindView(android.view.View, org.telegram.ui.Components.g61, boolean, org.telegram.ui.Components.t61, org.telegram.ui.Components.b71):void");
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        u4 u4Var = new u4(context, d6Var);
        u4Var.setBackground(new a2(h6.w0(h6.f20989d6, d6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
