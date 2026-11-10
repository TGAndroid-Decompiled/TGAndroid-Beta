package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class n4 extends w31 {
    public static final int f18735b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((o4) view).g((a) x31Var.G, (y2) x31Var.H);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new o4(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
