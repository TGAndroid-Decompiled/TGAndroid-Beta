package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class y extends v51 {
    public static final int f11772a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((z) view).i((a) w51Var.G, (q3) w51Var.H);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        z zVar = new z(context, i10, f6Var);
        zVar.setBackground(new a2(j6.v0(j6.f19094d6, f6Var)));
        return zVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
