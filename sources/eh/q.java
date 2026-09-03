package eh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.wh0;
public final class q extends g51 {
    public static final int f5665a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        wh0 wh0Var = (wh0) view;
        wh0Var.a((TLObject) h51Var.G, true, h51Var.f27388z);
        wh0Var.setOnClickListener(h51Var.D);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        wh0 wh0Var = new wh0(context);
        wh0Var.setBackground(k6.K0(false));
        return wh0Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
