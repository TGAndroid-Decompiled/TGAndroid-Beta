package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class q5 extends z41 {
    public static final int f3298b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        TL_iv.RichText richText;
        r5 r5Var = (r5) view;
        a aVar = (a) a51Var.G;
        p5 p5Var = (p5) a51Var.H;
        n1 n1Var = r5Var.f3326r;
        r5Var.f2881a = aVar;
        r5Var.f3327s = p5Var;
        r5Var.f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        r5Var.c(aVar);
        if (p5Var != null) {
            richText = (TL_iv.RichText) ((j3) p5Var).f3119a.f2948t3.get(Long.valueOf(aVar.f2833t));
        } else {
            richText = null;
        }
        if (!String.valueOf(n1Var.getText()).equals(s6.l(richText))) {
            n1Var.setTextSilently(org.telegram.messenger.k6.m(s6.r(richText, null, true), n1Var.getPaint().getFontMetricsInt(), false, null, 0));
            n1Var.f();
        }
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new r5(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
