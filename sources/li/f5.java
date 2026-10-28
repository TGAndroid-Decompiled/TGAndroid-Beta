package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class f5 extends t61 {
    public static final int f17236a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) u61Var.G;
        e5 e5Var = (e5) u61Var.H;
        g1 g1Var = g5Var.f17264r;
        g5Var.f17652a = aVar;
        g5Var.f17265s = e5Var;
        g5Var.f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((a3) e5Var).f17079a.f17566u3.get(Long.valueOf(aVar.f17068t));
        } else {
            richText = null;
        }
        if (!String.valueOf(g1Var.getText()).equals(f6.l(richText))) {
            g1Var.setTextSilently(Emoji.replaceEmoji(f6.r(richText, null, true), g1Var.getPaint().getFontMetricsInt(), false));
            g1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new g5(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
