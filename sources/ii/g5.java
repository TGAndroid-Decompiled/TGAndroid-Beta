package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class g5 extends t61 {
    public static final int f12445a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        TL_iv.RichText richText;
        h5 h5Var = (h5) view;
        a aVar = (a) u61Var.G;
        f5 f5Var = (f5) u61Var.H;
        i1 i1Var = h5Var.f12463r;
        h5Var.f12249a = aVar;
        h5Var.f12464s = f5Var;
        h5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h5Var.c(aVar);
        if (f5Var != null) {
            richText = (TL_iv.RichText) ((c3) f5Var).f12317a.f12816k3.get(Long.valueOf(aVar.f12248t));
        } else {
            richText = null;
        }
        if (!String.valueOf(i1Var.getText()).equals(g6.l(richText))) {
            i1Var.setTextSilently(Emoji.replaceEmoji(g6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h5(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
