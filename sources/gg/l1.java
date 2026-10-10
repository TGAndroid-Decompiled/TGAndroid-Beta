package gg;

import ai.w8;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class l1 extends p61 {
    public static final int f10714a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((m1) view).a((w8) q61Var.G);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new m1(context, e6Var);
    }
}
