package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class y0 extends l61 {
    public static final int f4004a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((z0) view).set((e1) m61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        z0 z0Var = new z0(i10, context, false);
        z0Var.setLayoutParams(new s4.o0(-2, -2));
        return z0Var;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.G == m61Var2.G) {
            return true;
        }
        return false;
    }
}
