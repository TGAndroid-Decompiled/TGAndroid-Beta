package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class g extends m41 {
    static {
        m41.setup(new g());
    }

    public static n41 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        n41 n41VarJ = n41.J(g.class);
        n41VarJ.d = i10;
        n41VarJ.f30857z = i11;
        n41VarJ.f30843k = i12;
        n41VarJ.f30844l = charSequence;
        n41VarJ.f30845m = str;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((h) view).a(n41Var.f30857z, n41Var.f30843k, n41Var.f30844l, n41Var.f30845m);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new h(context, c6Var);
    }
}
