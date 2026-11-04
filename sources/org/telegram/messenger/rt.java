package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class rt extends q31 {
    public static final int f25231b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        st stVar = (st) view;
        stVar.set((TL_iv.RichMessage) r31Var.G);
        stVar.setTranslationLoading(r31Var.f37621e);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d && r31Var.G == r31Var2.G && r31Var.f37621e == r31Var2.f37621e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        st stVar = new st(i3, context, e6Var);
        stVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return stVar;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }
}
