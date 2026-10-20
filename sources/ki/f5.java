package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class f5 extends g61 {
    public static final int f15266a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) h61Var.G;
        e5 e5Var = (e5) h61Var.H;
        h1 h1Var = g5Var.f15285r;
        g5Var.f15111a = aVar;
        g5Var.f15286s = e5Var;
        g5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).f15144a.f15602k3.get(Long.valueOf(aVar.f15110t));
        } else {
            richText = null;
        }
        if (!String.valueOf(h1Var.getText()).equals(e6.l(richText))) {
            h1Var.setTextSilently(Emoji.replaceEmoji(e6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g5(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
