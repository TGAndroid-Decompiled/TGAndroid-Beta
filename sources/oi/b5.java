package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class b5 extends a41 {
    public static final int f21593b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        TL_iv.RichText richText;
        c5 c5Var = (c5) view;
        a aVar = (a) b41Var.G;
        a5 a5Var = (a5) b41Var.H;
        e1 e1Var = c5Var.f21614r;
        c5Var.f22106a = aVar;
        c5Var.f21615s = a5Var;
        c5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        c5Var.c(aVar);
        if (a5Var != null) {
            richText = (TL_iv.RichText) ((x2) a5Var).f22119a.f21941u3.get(Long.valueOf(aVar.f21560t));
        } else {
            richText = null;
        }
        if (!String.valueOf(e1Var.getText()).equals(a6.l(richText))) {
            e1Var.setTextSilently(j6.m(a6.r(richText, null, true), e1Var.getPaint().getFontMetricsInt(), false, null, 0));
            e1Var.f();
        }
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new c5(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
