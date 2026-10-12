package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class c1 extends k61 {
    public static final int f2888a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((d1) view).set((f1) l61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d1(context);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.G == l61Var2.G) {
            return true;
        }
        return false;
    }
}
