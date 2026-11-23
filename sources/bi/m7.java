package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class m7 extends m41 {
    public static final int f3848b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        n7 n7Var = (n7) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) n41Var.H;
        int i7 = n41Var.A;
        String str = (String) n41Var.f37655m;
        boolean z11 = n41Var.f37648e;
        n7Var.getClass();
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, n7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        n7Var.j(spannableStringBuilder, 0, L);
        n7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, context, i6Var, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.c(org.telegram.ui.ActionBar.n6.E8, org.telegram.ui.ActionBar.n6.F8);
        y0Var.g(-1, PorterDuff.Mode.MULTIPLY);
        y0Var.f30346c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        y0Var.a(2);
        y0Var.setBackground(null);
        return y0Var;
    }
}
