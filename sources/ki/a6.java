package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class a6 extends k61 {
    public static final int f15178a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((c6) view).f((a) l61Var.G, (z5) l61Var.H, l61Var.f28233r);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        c6 c6Var = new c6(context, g6Var);
        c6Var.setBackground(new a2(k6.w0(k6.f21184d6, g6Var)));
        return c6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
