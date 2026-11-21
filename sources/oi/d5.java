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
public final class d5 extends n41 {
    public static final int f22057b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        TL_iv.RichText richText;
        e5 e5Var = (e5) view;
        a aVar = (a) o41Var.H;
        c5 c5Var = (c5) o41Var.I;
        f1 f1Var = e5Var.f22081r;
        e5Var.f22528a = aVar;
        e5Var.f22082s = c5Var;
        e5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e5Var.c(aVar);
        if (c5Var != null) {
            richText = (TL_iv.RichText) ((a3) c5Var).f21958a.f22435u3.get(Long.valueOf(aVar.f21948t));
        } else {
            richText = null;
        }
        if (!String.valueOf(f1Var.getText()).equals(c6.l(richText))) {
            f1Var.setTextSilently(j6.m(c6.r(richText, null, true), f1Var.getPaint().getFontMetricsInt(), false, null, 0));
            f1Var.f();
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new e5(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
