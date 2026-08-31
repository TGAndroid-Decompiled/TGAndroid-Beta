package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class c0 extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(String str, CharSequence charSequence, int i10) {
        j51 J = j51.J(c0.class);
        J.f2506b = false;
        J.f28027z = i10;
        J.f28014l = str;
        J.f28015m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        ((d0) view).a(j51Var.f28014l, j51Var.f28015m, j51Var.f28027z);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new d0(context, 0, g6Var);
    }
}
