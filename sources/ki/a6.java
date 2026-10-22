package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class a6 extends g61 {
    public static final int f15132a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((c6) view).g((a) h61Var.G, (z5) h61Var.H, h61Var.f26791r);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        c6 c6Var = new c6(context, d6Var);
        c6Var.setBackground(new a2(h6.w0(h6.f20993d6, d6Var)));
        return c6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
