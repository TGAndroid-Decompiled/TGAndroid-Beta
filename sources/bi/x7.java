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
public final class x7 extends n41 {
    public static final int f4221b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        y7 y7Var = (y7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.f38058m;
        boolean z11 = o41Var.f38051e;
        org.telegram.ui.ActionBar.h6 h6Var = y7Var.P;
        rh0 rh0Var = y7Var.f30255c;
        w7 w7Var = y7Var.f4271b0;
        if (w7Var == null || y7Var.f4270a0 != stargiftattributepattern.document.f28404id) {
            y7Var.f4270a0 = stargiftattributepattern.document.f28404id;
            if (w7Var != null) {
                w7Var.n(rh0Var);
            }
            ?? p5Var = new org.telegram.ui.Components.p5(3, y7Var.W, stargiftattributepattern.document);
            y7Var.f4271b0 = p5Var;
            org.telegram.ui.ActionBar.t6.x(y7Var, p5Var, org.telegram.ui.ActionBar.m6.E8, h6Var, PorterDuff.Mode.SRC_IN);
        }
        if (rh0Var.isAttachedToWindow()) {
            y7Var.f4271b0.a(rh0Var);
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
        y7Var.j(spannableStringBuilder, 0, y7Var.f4271b0);
        y7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new y7(i7, context, h6Var);
    }
}
