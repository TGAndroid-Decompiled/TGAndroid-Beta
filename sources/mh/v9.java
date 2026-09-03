package mh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class v9 extends g51 {
    public static final int f14951a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        h51 J = h51.J(v9.class);
        J.d = i10;
        J.f27388z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f27375l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f27376m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        float f10;
        w9 w9Var = (w9) view;
        int i10 = h51Var.f27388z;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        org.telegram.ui.Components.k6 k6Var = w9Var.f15003e;
        TextView textView = w9Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        w9Var.f15005n = i10;
        if (!equals) {
            w9Var.f15006r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (w9Var.f15004f == null) {
                SpannableString spannableString = new SpannableString("x");
                w9Var.f15004f = spannableString;
                spannableString.setSpan(new l90(AndroidUtilities.dp(55.0f), k6Var), 0, w9Var.f15004f.length(), 33);
            }
            charSequence2 = w9Var.f15004f;
        }
        k6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(pr.h).start();
        } else {
            textView.setTranslationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        w9Var.h = z4;
        w9Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f27388z == h51Var2.f27388z && h51Var.d == h51Var2.d && TextUtils.equals(h51Var.f27376m, h51Var2.f27376m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w9(context, g6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }
}
