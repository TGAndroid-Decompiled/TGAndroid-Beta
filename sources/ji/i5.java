package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class i5 extends g51 {
    public static final int f13982a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        TL_iv.RichText richText;
        j5 j5Var = (j5) view;
        a aVar = (a) h51Var.G;
        h5 h5Var = (h5) h51Var.H;
        h1 h1Var = j5Var.f13996r;
        j5Var.f13749a = aVar;
        j5Var.f13997s = h5Var;
        j5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        j5Var.c(aVar);
        if (h5Var != null) {
            richText = (TL_iv.RichText) ((a3) h5Var).f13761a.f14257m3.get(Long.valueOf(aVar.f13748t));
        } else {
            richText = null;
        }
        if (!String.valueOf(h1Var.getText()).equals(i6.l(richText))) {
            h1Var.setTextSilently(Emoji.replaceEmoji(i6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j5(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
