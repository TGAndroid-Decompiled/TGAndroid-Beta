package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class i extends t61 {
    public static final int f10920a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        long j3 = u61Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), u61Var.f31070k, u61Var.f31071l, u61Var.f31073n, u61Var.f31076q);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new j(context, c6Var, false);
    }
}
