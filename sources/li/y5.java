package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class y5 extends x31 {
    public static final int f19034b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((a6) view).f((a) y31Var.G, (x5) y31Var.H, y31Var.f40574r);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        a6 a6Var = new a6(context, g6Var);
        a6Var.setBackground(new y1(l6.w0(l6.f27865d6, g6Var)));
        return a6Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
