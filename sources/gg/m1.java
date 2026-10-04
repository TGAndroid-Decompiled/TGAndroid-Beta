package gg;

import ai.v8;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class m1 extends f61 {
    public static final int f10718a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((n1) view).a((v8) g61Var.G);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new n1(context, d6Var);
    }
}
