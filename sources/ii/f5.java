package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class f5 extends h51 {
    public static final int f11378a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) i51Var.G;
        e5 e5Var = (e5) i51Var.H;
        i1 i1Var = g5Var.f11392r;
        g5Var.f11217a = aVar;
        g5Var.f11393s = e5Var;
        g5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).f11254a.f11719m3.get(Long.valueOf(aVar.f11216t));
        } else {
            richText = null;
        }
        if (!String.valueOf(i1Var.getText()).equals(f6.l(richText))) {
            i1Var.setTextSilently(Emoji.replaceEmoji(f6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new g5(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
