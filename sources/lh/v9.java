package lh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class v9 extends h51 {
    public static final int f13258a = 0;

    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        i51 J = i51.J(v9.class);
        J.d = i10;
        J.f25578z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f25565l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f25566m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        float f10;
        w9 w9Var = (w9) view;
        int i10 = i51Var.f25578z;
        CharSequence charSequence = i51Var.f25565l;
        CharSequence charSequence2 = i51Var.f25566m;
        org.telegram.ui.Components.k6 k6Var = w9Var.e;
        TextView textView = w9Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        w9Var.f13310n = i10;
        if (!equals) {
            w9Var.f13311r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (w9Var.f13309f == null) {
                SpannableString spannableString = new SpannableString("x");
                w9Var.f13309f = spannableString;
                spannableString.setSpan(new j90(AndroidUtilities.dp(55.0f), k6Var), 0, w9Var.f13309f.length(), 33);
            }
            charSequence2 = w9Var.f13309f;
        }
        k6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(nr.h).start();
        } else {
            textView.setTranslationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        w9Var.h = z4;
        w9Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.f25578z == i51Var2.f25578z && i51Var.d == i51Var2.d && TextUtils.equals(i51Var.f25566m, i51Var2.f25566m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w9(context, f6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }
}
