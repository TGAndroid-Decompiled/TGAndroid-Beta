package bi;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.rh0;
public final class v7 extends n41 {
    public static final int f4192b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        w7 w7Var = (w7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.f38098m;
        boolean z11 = o41Var.f38091e;
        org.telegram.ui.ActionBar.h6 h6Var = w7Var.P;
        rh0 rh0Var = w7Var.f30286c;
        u7 u7Var = w7Var.f4224b0;
        if (u7Var == null || w7Var.f4223a0 != stargiftattributepattern.document.f28437id) {
            w7Var.f4223a0 = stargiftattributepattern.document.f28437id;
            if (u7Var != null) {
                u7Var.n(rh0Var);
            }
            ?? p5Var = new org.telegram.ui.Components.p5(3, w7Var.W, stargiftattributepattern.document);
            w7Var.f4224b0 = p5Var;
            org.telegram.ui.ActionBar.t6.x(w7Var, p5Var, org.telegram.ui.ActionBar.m6.E8, h6Var, PorterDuff.Mode.SRC_IN);
        }
        if (rh0Var.isAttachedToWindow()) {
            w7Var.f4224b0.a(rh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, h6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        w7Var.j(spannableStringBuilder, 0, w7Var.f4224b0);
        w7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w7(i7, context, h6Var);
    }
}
