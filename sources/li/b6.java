package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class b6 extends t61 {
    public static final int f17155a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((d6) view).f((a) u61Var.G, (a6) u61Var.H, u61Var.f33255r);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        d6 d6Var = new d6(context, u6Var);
        d6Var.setBackground(new y1(y6.w0(y6.f23357d6, u6Var)));
        return d6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
