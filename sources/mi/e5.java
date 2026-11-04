package mi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class e5 extends q31 {
    public static final int f19585b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        TL_iv.RichText richText;
        f5 f5Var = (f5) view;
        a aVar = (a) r31Var.G;
        d5 d5Var = (d5) r31Var.H;
        h1 h1Var = f5Var.f19604r;
        f5Var.f20029a = aVar;
        f5Var.f19605s = d5Var;
        f5Var.f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f5Var.c(aVar);
        if (d5Var != null) {
            richText = (TL_iv.RichText) ((a3) d5Var).f19458a.f19926u3.get(Long.valueOf(aVar.f19447t));
        } else {
            richText = null;
        }
        if (!String.valueOf(h1Var.getText()).equals(d6.l(richText))) {
            h1Var.setTextSilently(i6.m(d6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false, null, 0));
            h1Var.f();
        }
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f5(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
