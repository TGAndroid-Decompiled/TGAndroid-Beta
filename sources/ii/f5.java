package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class f5 extends v51 {
    public static final int f11382a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        TL_iv.RichText richText;
        g5 g5Var = (g5) view;
        a aVar = (a) w51Var.G;
        e5 e5Var = (e5) w51Var.H;
        i1 i1Var = g5Var.f11396r;
        g5Var.f11221a = aVar;
        g5Var.f11397s = e5Var;
        g5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g5Var.c(aVar);
        if (e5Var != null) {
            richText = (TL_iv.RichText) ((b3) e5Var).f11258a.f11723m3.get(Long.valueOf(aVar.f11220t));
        } else {
            richText = null;
        }
        if (!String.valueOf(i1Var.getText()).equals(f6.l(richText))) {
            i1Var.setTextSilently(Emoji.replaceEmoji(f6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g5(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
