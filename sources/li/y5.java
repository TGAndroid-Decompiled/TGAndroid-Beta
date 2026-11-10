package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class y5 extends w31 {
    public static final int f19039b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((a6) view).f((a) x31Var.G, (x5) x31Var.H, x31Var.f40162r);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        a6 a6Var = new a6(context, h6Var);
        a6Var.setBackground(new y1(m6.w0(m6.f27890d6, h6Var)));
        return a6Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
