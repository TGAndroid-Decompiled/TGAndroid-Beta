package ih;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class o4 extends v41 {
    public static final int f9319a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        p4 p4Var = (p4) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) w41Var.G;
        int i10 = w41Var.f34313z;
        String str = (String) w41Var.f34300l;
        boolean z11 = w41Var.f34294e;
        p4Var.getClass();
        ShapeDrawable K = g6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, p4Var.B);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new t41(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        p4Var.g(spannableStringBuilder, 0, K);
        p4Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, context, c6Var, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.c(g6.v0(g6.E8, c6Var), g6.v0(g6.F8, c6Var));
        g1Var.e(-1, PorterDuff.Mode.MULTIPLY);
        g1Var.f22965c.setTranslationX(AndroidUtilities.dp(2.0f));
        g1Var.a(2);
        g1Var.setBackground(null);
        return g1Var;
    }
}
