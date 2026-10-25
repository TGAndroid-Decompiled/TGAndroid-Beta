package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class v0 extends s61 {
    public static final int f17537a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        w0 w0Var = (w0) view;
        a aVar = (a) t61Var.G;
        w0Var.f17653a = aVar;
        w0Var.v = (q2) t61Var.H;
        w0Var.f17594w = LocaleController.isRTL;
        w0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new w0(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
