package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class s4 extends q31 {
    public static final int f19885b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(android.view.View r2, org.telegram.ui.Components.r31 r3, boolean r4, org.telegram.ui.Components.f41 r5, org.telegram.ui.Components.l41 r6) {
        throw new UnsupportedOperationException("Method not decompiled: mi.s4.b(android.view.View, org.telegram.ui.Components.r31, boolean, org.telegram.ui.Components.f41, org.telegram.ui.Components.l41):void");
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        t4 t4Var = new t4(context, e6Var);
        t4Var.setBackground(new z1(k6.w0(k6.f27878d6, e6Var)));
        return t4Var;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
