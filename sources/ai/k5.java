package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class k5 extends q31 {
    public static final int f766b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        l5 l5Var = (l5) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) r31Var.G;
        int i3 = r31Var.f37640z;
        String str = (String) r31Var.f37627l;
        boolean z11 = r31Var.f37621e;
        l5Var.getClass();
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, l5Var.P);
        }
        if (i3 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i3));
            spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        l5Var.j(spannableStringBuilder, 0, L);
        l5Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context, e6Var, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        y0Var.g(-1, PorterDuff.Mode.MULTIPLY);
        y0Var.f28814c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        y0Var.a(2);
        y0Var.setBackground(null);
        return y0Var;
    }
}
