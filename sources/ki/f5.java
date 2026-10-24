package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class f5 extends k61 {
    public static final int f15324a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) l61Var.G;
        e5 e5Var = (e5) l61Var.H;
        h1 h1Var = g5Var.f15343r;
        g5Var.f15157a = aVar;
        g5Var.f15344s = e5Var;
        g5Var.f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).f15190a.f15665n3.get(Long.valueOf(aVar.f15156t));
        } else {
            richText = null;
        }
        if (!String.valueOf(h1Var.getText()).equals(e6.l(richText))) {
            h1Var.setTextSilently(Emoji.replaceEmoji(e6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g5(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
