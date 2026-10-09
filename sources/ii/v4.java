package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class v4 extends o61 {
    public static final int f12752a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.p61 r3, boolean r4, org.telegram.ui.Components.c71 r5, org.telegram.ui.Components.k71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.v4.bindView(android.view.View, org.telegram.ui.Components.p61, boolean, org.telegram.ui.Components.c71, org.telegram.ui.Components.k71):void");
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        w4 w4Var = new w4(context, e6Var);
        w4Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var)));
        return w4Var;
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
