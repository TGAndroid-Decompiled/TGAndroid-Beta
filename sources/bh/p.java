package bh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.nh0;
public final class p extends v41 {
    public static final int f2694a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        nh0 nh0Var = (nh0) view;
        nh0Var.a((TLObject) w41Var.G, true, w41Var.f34313z);
        nh0Var.setOnClickListener(w41Var.D);
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.B == w41Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        nh0 nh0Var = new nh0(context);
        nh0Var.setBackground(g6.K0(false));
        return nh0Var;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.B == w41Var2.B) {
            return true;
        }
        return false;
    }
}
