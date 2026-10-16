package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class c1 extends l61 {
    public static final int f2892a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((d1) view).set((f1) m61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d1(context);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.G == m61Var2.G) {
            return true;
        }
        return false;
    }
}
