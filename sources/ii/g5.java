package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class g5 extends w51 {
    public static final int f11387a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        TL_iv.RichText richText;
        h5 h5Var = (h5) view;
        a aVar = (a) x51Var.G;
        f5 f5Var = (f5) x51Var.H;
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
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new h5(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
