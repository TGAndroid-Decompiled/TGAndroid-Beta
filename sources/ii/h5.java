package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class h5 extends q61 {
    public static final int f12463a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        TL_iv.RichText richText;
        i5 i5Var = (i5) view;
        a aVar = (a) r61Var.G;
        g5 g5Var = (g5) r61Var.H;
        i1 i1Var = i5Var.f12493r;
        i5Var.f12250a = aVar;
        i5Var.f12494s = g5Var;
        i5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i5Var.c(aVar);
        if (g5Var != null) {
            richText = (TL_iv.RichText) ((c3) g5Var).f12310a.f12817k3.get(Long.valueOf(aVar.f12249t));
        } else {
            richText = null;
        }
        if (!String.valueOf(i1Var.getText()).equals(h6.l(richText))) {
            i1Var.setTextSilently(Emoji.replaceEmoji(h6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new i5(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
