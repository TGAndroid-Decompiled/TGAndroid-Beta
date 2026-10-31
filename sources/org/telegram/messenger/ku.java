package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class ku extends z41 {
    public static final int f16636b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        lu luVar = (lu) view;
        luVar.set((TL_iv.RichMessage) a51Var.G);
        luVar.setTranslationLoading(a51Var.e);
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d && a51Var.G == a51Var2.G && a51Var.e == a51Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        lu luVar = new lu(i10, context, p6Var);
        luVar.setPadding(i0.L(20.0f), 0, i0.L(20.0f), i0.L(16.0f));
        return luVar;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }
}
