package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class c5 extends n41 {
    public static final int f22003b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        TL_iv.RichText richText;
        d5 d5Var = (d5) view;
        a aVar = (a) o41Var.H;
        b5 b5Var = (b5) o41Var.I;
        e1 e1Var = d5Var.f22021r;
        d5Var.f22468a = aVar;
        d5Var.f22022s = b5Var;
        d5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        d5Var.c(aVar);
        if (b5Var != null) {
            richText = (TL_iv.RichText) ((z2) b5Var).f22543a.f22375u3.get(Long.valueOf(aVar.f21917t));
        } else {
            richText = null;
        }
        if (!String.valueOf(e1Var.getText()).equals(b6.l(richText))) {
            e1Var.setTextSilently(j6.m(b6.r(richText, null, true), e1Var.getPaint().getFontMetricsInt(), false, null, 0));
            e1Var.f();
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new d5(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
