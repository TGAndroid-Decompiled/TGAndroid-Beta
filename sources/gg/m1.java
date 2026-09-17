package gg;

import ai.v8;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class m1 extends i51 {
    public static final int f9863a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        ((n1) view).a((v8) j51Var.G);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new n1(context, f6Var);
    }
}
