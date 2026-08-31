package eh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.wh0;
public final class q extends i51 {
    public static final int f5665a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        wh0 wh0Var = (wh0) view;
        wh0Var.a((TLObject) j51Var.G, true, j51Var.f28027z);
        wh0Var.setOnClickListener(j51Var.D);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        wh0 wh0Var = new wh0(context);
        wh0Var.setBackground(k6.K0(false));
        return wh0Var;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }
}
