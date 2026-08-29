package jh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class u9 extends v41 {
    public static final int f12927a = 0;

    static {
        v41.setup(new v41());
    }

    public static w41 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        w41 J = w41.J(u9.class);
        J.d = i10;
        J.f34313z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f34300l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f34301m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        float f9;
        v9 v9Var = (v9) view;
        int i10 = w41Var.f34313z;
        CharSequence charSequence = w41Var.f34300l;
        CharSequence charSequence2 = w41Var.f34301m;
        org.telegram.ui.Components.o6 o6Var = v9Var.f12982e;
        TextView textView = v9Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        v9Var.f12984n = i10;
        if (!equals) {
            v9Var.f12985r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (v9Var.f12983f == null) {
                SpannableString spannableString = new SpannableString("x");
                v9Var.f12983f = spannableString;
                spannableString.setSpan(new d90(AndroidUtilities.dp(55.0f), o6Var), 0, v9Var.f12983f.length(), 33);
            }
            charSequence2 = v9Var.f12983f;
        }
        o6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f9 = -1.0f;
        } else {
            f9 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f9 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(jr.h).start();
        } else {
            textView.setTranslationX(f9 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        v9Var.h = z10;
        v9Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.f34313z == w41Var2.f34313z && w41Var.d == w41Var2.d && TextUtils.equals(w41Var.f34301m, w41Var2.f34301m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new v9(context, c6Var);
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }
}
