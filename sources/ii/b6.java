package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class b6 extends v51 {
    public static final int f11272a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((d6) view).g((a) w51Var.G, (a6) w51Var.H, w51Var.f29954r);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        d6 d6Var = new d6(context, f6Var);
        d6Var.setBackground(new a2(j6.v0(j6.f19094d6, f6Var)));
        return d6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
