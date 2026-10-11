package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class v4 extends p61 {
    public static final int f12751a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.q61 r3, boolean r4, org.telegram.ui.Components.d71 r5, org.telegram.ui.Components.l71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.v4.bindView(android.view.View, org.telegram.ui.Components.q61, boolean, org.telegram.ui.Components.d71, org.telegram.ui.Components.l71):void");
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        w4 w4Var = new w4(context, d6Var);
        w4Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, d6Var)));
        return w4Var;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
