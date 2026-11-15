package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class wt extends a41 {
    public static final int f27393b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        xt xtVar = (xt) view;
        xtVar.set((TL_iv.RichMessage) b41Var.G);
        xtVar.setTranslationLoading(b41Var.f33175e);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d && b41Var.G == b41Var2.G && b41Var.f33175e == b41Var2.f33175e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        xt xtVar = new xt(i7, context, e6Var);
        xtVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return xtVar;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }
}
