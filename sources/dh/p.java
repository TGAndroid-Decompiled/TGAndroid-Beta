package dh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.xh0;
public final class p extends h51 {
    public static final int f4934a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        xh0 xh0Var = (xh0) view;
        xh0Var.a((TLObject) i51Var.G, true, i51Var.f25598z);
        xh0Var.setOnClickListener(i51Var.D);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.B == i51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        xh0 xh0Var = new xh0(context);
        xh0Var.setBackground(j6.K0(false));
        return xh0Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.B == i51Var2.B) {
            return true;
        }
        return false;
    }
}
