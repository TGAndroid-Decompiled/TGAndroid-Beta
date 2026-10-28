package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class e0 extends t61 {
    public static final int f17205a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) u61Var.G;
        f0Var.f17652a = aVar;
        f0Var.E = (d0) u61Var.H;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        f0 f0Var = new f0(context, i10, u6Var);
        f0Var.setBackground(new y1(y6.w0(y6.f23357d6, u6Var)));
        return f0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
