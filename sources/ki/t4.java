package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class t4 extends l61 {
    public static final int f15590a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(android.view.View r2, org.telegram.ui.Components.m61 r3, boolean r4, org.telegram.ui.Components.b71 r5, org.telegram.ui.Components.j71 r6) {
        throw new UnsupportedOperationException("Method not decompiled: ki.t4.bindView(android.view.View, org.telegram.ui.Components.m61, boolean, org.telegram.ui.Components.b71, org.telegram.ui.Components.j71):void");
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        u4 u4Var = new u4(context, g6Var);
        u4Var.setBackground(new a2(k6.w0(k6.f21183d6, g6Var)));
        return u4Var;
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
