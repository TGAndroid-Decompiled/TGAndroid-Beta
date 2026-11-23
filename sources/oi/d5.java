package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class d5 extends m41 {
    public static final int f22126b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) n41Var.H;
        c5 c5Var = (c5) n41Var.I;
        f1 f1Var = e5Var.f22150r;
        e5Var.f22598a = aVar;
        e5Var.f22151s = c5Var;
        e5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e5Var.c(aVar);
        if (c5Var != null) {
            richText = (TL_iv.RichText) ((a3) c5Var).f22027a.f22505u3.get(Long.valueOf(aVar.f22017t));
        } else {
            richText = null;
        }
        if (!String.valueOf(f1Var.getText()).equals(c6.l(richText))) {
            f1Var.setTextSilently(j6.m(c6.r(richText, null, true), f1Var.getPaint().getFontMetricsInt(), false, null, 0));
            f1Var.f();
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new e5(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
