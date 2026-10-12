package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class k5 extends k61 {
    public static final int f13374a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        TL_iv.RichText richText;
        l5 l5Var = (l5) view;
        a aVar = (a) l61Var.G;
        j5 j5Var = (j5) l61Var.H;
        h1 h1Var = l5Var.f13391r;
        l5Var.f13119a = aVar;
        l5Var.f13392s = j5Var;
        l5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        l5Var.c(aVar);
        if (j5Var != null) {
            richText = (TL_iv.RichText) ((c3) j5Var).f13172a.f13637k3.get(Long.valueOf(aVar.f13118t));
        } else {
            richText = null;
        }
        if (!String.valueOf(h1Var.getText()).equals(k6.l(richText))) {
            h1Var.setTextSilently(Emoji.replaceEmoji(k6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l5(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
