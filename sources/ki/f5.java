package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class f5 extends e61 {
    public static final int f15265a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) f61Var.G;
        e5 e5Var = (e5) f61Var.H;
        h1 h1Var = g5Var.f15284r;
        g5Var.f15110a = aVar;
        g5Var.f15285s = e5Var;
        g5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).f15143a.f15601k3.get(Long.valueOf(aVar.f15109t));
        } else {
            richText = null;
        }
        if (!String.valueOf(h1Var.getText()).equals(e6.l(richText))) {
            h1Var.setTextSilently(Emoji.replaceEmoji(e6.r(richText, null, true), h1Var.getPaint().getFontMetricsInt(), false));
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g5(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
