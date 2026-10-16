package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class x4 extends l61 {
    public static final int f13660a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.m61 r3, boolean r4, org.telegram.ui.Components.a71 r5, org.telegram.ui.Components.i71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ji.x4.bindView(android.view.View, org.telegram.ui.Components.m61, boolean, org.telegram.ui.Components.a71, org.telegram.ui.Components.i71):void");
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        y4 y4Var = new y4(context, c6Var);
        y4Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var)));
        return y4Var;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
