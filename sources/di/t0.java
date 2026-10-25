package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class t0 extends s61 {
    public static final int f9177a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((u0) view).set((w0) t61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new u0(context);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.G == t61Var2.G) {
            return true;
        }
        return false;
    }
}
