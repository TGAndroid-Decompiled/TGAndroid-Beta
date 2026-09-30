package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class v0 extends x51 {
    public static final int f11674a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((w0) view).f11705c = (a) y51Var.G;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
