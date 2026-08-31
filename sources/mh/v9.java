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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class v9 extends i51 {
    public static final int f14949a = 0;

    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        j51 J = j51.J(v9.class);
        J.d = i10;
        J.f28027z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f28014l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f28015m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        float f10;
        w9 w9Var = (w9) view;
        int i10 = j51Var.f28027z;
        CharSequence charSequence = j51Var.f28014l;
        CharSequence charSequence2 = j51Var.f28015m;
        org.telegram.ui.Components.k6 k6Var = w9Var.f15001e;
        TextView textView = w9Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        w9Var.f15003n = i10;
        if (!equals) {
            w9Var.f15004r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (w9Var.f15002f == null) {
                SpannableString spannableString = new SpannableString("x");
                w9Var.f15002f = spannableString;
                spannableString.setSpan(new l90(AndroidUtilities.dp(55.0f), k6Var), 0, w9Var.f15002f.length(), 33);
            }
            charSequence2 = w9Var.f15002f;
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
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.f28027z == j51Var2.f28027z && j51Var.d == j51Var2.d && TextUtils.equals(j51Var.f28015m, j51Var2.f28015m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w9(context, g6Var);
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }
}
