package gg;

import ai.w8;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class l1 extends o61 {
    public static final int f10714a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((m1) view).a((w8) p61Var.G);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new m1(context, e6Var);
    }
}
