package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class g5 extends g51 {
    public static final int f11387a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        TL_iv.RichText richText;
        h5 h5Var = (h5) view;
        a aVar = (a) h51Var.G;
        f5 f5Var = (f5) h51Var.H;
        i1 i1Var = h5Var.f11405r;
        h5Var.f11207a = aVar;
        h5Var.f11406s = f5Var;
        h5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h5Var.c(aVar);
        if (f5Var != null) {
            richText = (TL_iv.RichText) ((c3) f5Var).f11269a.f11736m3.get(Long.valueOf(aVar.f11206t));
        } else {
            richText = null;
        }
        if (!String.valueOf(i1Var.getText()).equals(g6.l(richText))) {
            i1Var.setTextSilently(Emoji.replaceEmoji(g6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new h5(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
