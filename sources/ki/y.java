package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class y extends g61 {
    public static final int f15656a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((z) view).i((a) h61Var.G, (q3) h61Var.H);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        z zVar = new z(context, i10, d6Var);
        zVar.setBackground(new a2(h6.w0(h6.f20994d6, d6Var)));
        return zVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
