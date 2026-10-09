package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class h5 extends o61 {
    public static final int f12464a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        TL_iv.RichText richText;
        i5 i5Var = (i5) view;
        a aVar = (a) p61Var.G;
        g5 g5Var = (g5) p61Var.H;
        i1 i1Var = i5Var.f12494r;
        i5Var.f12251a = aVar;
        i5Var.f12495s = g5Var;
        i5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i5Var.c(aVar);
        if (g5Var != null) {
            richText = (TL_iv.RichText) ((c3) g5Var).f12311a.f12818k3.get(Long.valueOf(aVar.f12250t));
        } else {
            richText = null;
        }
        if (!String.valueOf(i1Var.getText()).equals(h6.l(richText))) {
            i1Var.setTextSilently(Emoji.replaceEmoji(h6.r(richText, null, true), i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i5(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
