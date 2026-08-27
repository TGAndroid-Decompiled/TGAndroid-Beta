package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class i extends m41 {
    static {
        m41.setup(new i());
    }

    public static n41 a(int i10, String str, String str2) {
        n41 n41VarJ = n41.J(i.class);
        n41VarJ.f30843k = i10;
        n41VarJ.f30844l = str;
        n41VarJ.f30845m = str2;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((j) view).a(n41Var.f30844l, n41Var.f30845m, n41Var.f30843k);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new j(context, c6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
