package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class t4 extends s61 {
    public static final int f17499a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.t61 r3, boolean r4, org.telegram.ui.Components.j71 r5, org.telegram.ui.Components.r71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: li.t4.bindView(android.view.View, org.telegram.ui.Components.t61, boolean, org.telegram.ui.Components.j71, org.telegram.ui.Components.r71):void");
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        u4 u4Var = new u4(context, u6Var);
        u4Var.setBackground(new y1(y6.w0(y6.f23354d6, u6Var)));
        return u4Var;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
