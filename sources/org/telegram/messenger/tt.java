package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class tt extends n41 {
    public static final int f27096b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ut utVar = (ut) view;
        utVar.set((TL_iv.RichMessage) o41Var.H);
        utVar.setTranslationLoading(o41Var.f38091e);
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d && o41Var.H == o41Var2.H && o41Var.f38091e == o41Var2.f38091e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ut utVar = new ut(i7, context, h6Var);
        utVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return utVar;
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }
}
