package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class y extends k61 {
    public static final int f13660a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((z) view).i((a) l61Var.G, (r3) l61Var.H);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        z zVar = new z(context, i10, c6Var);
        zVar.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var)));
        return zVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
