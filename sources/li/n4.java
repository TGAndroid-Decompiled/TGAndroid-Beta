package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class n4 extends t61 {
    public static final int f17380a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((o4) view).g((a) u61Var.G, (m4) u61Var.H);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new o4(context, i10, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
