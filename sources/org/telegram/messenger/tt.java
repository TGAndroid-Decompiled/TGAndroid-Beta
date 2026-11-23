package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class tt extends m41 {
    public static final int f27165b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ut utVar = (ut) view;
        utVar.set((TL_iv.RichMessage) n41Var.H);
        utVar.setTranslationLoading(n41Var.f37648e);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d && n41Var.H == n41Var2.H && n41Var.f37648e == n41Var2.f37648e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ut utVar = new ut(i7, context, i6Var);
        utVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return utVar;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }
}
