package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class g1 extends v51 {
    public static final int f891a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((h1) view).set((m1) w51Var.G);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        h1 h1Var = new h1(i10, context, false);
        h1Var.setLayoutParams(new s4.p0(-2, -2));
        return h1Var;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.G == w51Var2.G) {
            return true;
        }
        return false;
    }
}
