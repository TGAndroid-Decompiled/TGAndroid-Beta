package hg;

import android.content.Context;
import android.view.View;
import bi.g8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class l1 extends k61 {
    public static final int f10657a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((m1) view).a((g8) l61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new m1(context, c6Var);
    }
}
