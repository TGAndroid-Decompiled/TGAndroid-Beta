package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class d5 extends x31 {
    public static final int f18526b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) y31Var.G;
        c5 c5Var = (c5) y31Var.H;
        g1 g1Var = e5Var.f18539r;
        e5Var.f18989a = aVar;
        e5Var.f18540s = c5Var;
        e5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e5Var.c(aVar);
        if (c5Var != null) {
            richText = (TL_iv.RichText) ((z2) c5Var).f19046a.f18899t3.get(Long.valueOf(aVar.f18408t));
        } else {
            richText = null;
        }
        if (!String.valueOf(g1Var.getText()).equals(c6.l(richText))) {
            g1Var.setTextSilently(i6.m(c6.r(richText, null, true), g1Var.getPaint().getFontMetricsInt(), false, null, 0));
            g1Var.f();
        }
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new e5(context, g6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
