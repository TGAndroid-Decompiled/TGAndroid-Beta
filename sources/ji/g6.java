package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class g6 extends l61 {
    public static final int f13288a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((i6) view).g((a) m61Var.G, (f6) m61Var.H, m61Var.f26952r);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        i6 i6Var = new i6(context, c6Var);
        i6Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var)));
        return i6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
