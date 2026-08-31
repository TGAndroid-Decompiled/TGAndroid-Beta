package hh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class e extends i51 {
    public static final int f7697a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        lg.c cVar = (lg.c) view;
        cVar.f12534s = (TLRPC.TL_help_country) j51Var.G;
        cVar.f();
        cVar.setDivider(z4);
        cVar.c(j51Var.f28008e, false);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.H(j51Var2);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        lg.c cVar = new lg.c(context, g6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.I(j51Var2);
    }
}
