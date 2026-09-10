package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class i5 extends u51 {
    public static final int f9664a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        TL_iv.RichText richText;
        j5 j5Var = (j5) view;
        a aVar = (a) v51Var.G;
        h5 h5Var = (h5) v51Var.H;
        k1 k1Var = j5Var.f9680r;
        j5Var.f9464a = aVar;
        j5Var.f9681s = h5Var;
        j5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        j5Var.c(aVar);
        if (h5Var != null) {
            richText = (TL_iv.RichText) ((e3) h5Var).f9542a.f10009m3.get(Long.valueOf(aVar.f9436t));
        } else {
            richText = null;
        }
        if (!String.valueOf(k1Var.getText()).equals(i6.l(richText))) {
            k1Var.setTextSilently(Emoji.replaceEmoji(i6.r(richText, null, true), k1Var.getPaint().getFontMetricsInt(), false));
            k1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j5(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
