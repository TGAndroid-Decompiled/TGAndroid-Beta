package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class y extends g61 {
    public static final int f12796a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((z) view).i((a) h61Var.G, (r3) h61Var.H);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        z zVar = new z(context, i10, d6Var);
        zVar.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var)));
        return zVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
