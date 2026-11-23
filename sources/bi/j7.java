package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class j7 extends n41 {
    public static final int f3756b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        k7 k7Var = (k7) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.f38092m;
        boolean z11 = o41Var.f38085e;
        k7Var.getClass();
        ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, k7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        k7Var.j(spannableStringBuilder, 0, L);
        k7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context, h6Var, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.c(org.telegram.ui.ActionBar.m6.E8, org.telegram.ui.ActionBar.m6.F8);
        y0Var.g(-1, PorterDuff.Mode.MULTIPLY);
        y0Var.f30289c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        y0Var.a(2);
        y0Var.setBackground(null);
        return y0Var;
    }
}
