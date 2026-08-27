package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class v4 extends m41 {

    public static final int f7593a = 0;

    static {
        m41.setup(new v4());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n41Var.G;
        int i10 = n41Var.f30857z;
        String str = (String) n41Var.f30844l;
        boolean z11 = n41Var.f30838e;
        w4Var.getClass();
        ShapeDrawable shapeDrawableK = org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        CharSequence charSequenceHighlightText = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, w4Var.B);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceHighlightText);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequenceHighlightText = spannableStringBuilder;
        }
        w4Var.g(charSequenceHighlightText, 0, shapeDrawableK);
        w4Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        w4 w4Var = new w4(0, context, c6Var, false, false);
        w4Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        w4Var.c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var));
        w4Var.e(-1, PorterDuff.Mode.MULTIPLY);
        w4Var.f22913c.setTranslationX(AndroidUtilities.dp(2.0f));
        w4Var.a(2);
        w4Var.setBackground(null);
        return w4Var;
    }
}
