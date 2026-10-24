package ai;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zr;
public final class yc extends k61 {
    public static final int f2523a = 0;

    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        l61 J = l61.J(yc.class);
        J.d = i10;
        J.f28240z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f28227l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f28228m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        float f7;
        zc zcVar = (zc) view;
        int i10 = l61Var.f28240z;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        org.telegram.ui.Components.o6 o6Var = zcVar.e;
        TextView textView = zcVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        zcVar.f2561n = i10;
        if (!equals) {
            zcVar.f2562r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (zcVar.f2560f == null) {
                SpannableString spannableString = new SpannableString("x");
                zcVar.f2560f = spannableString;
                spannableString.setSpan(new ba0(AndroidUtilities.dp(55.0f), o6Var), 0, zcVar.f2560f.length(), 33);
            }
            charSequence2 = zcVar.f2560f;
        }
        o6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(zr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        zcVar.h = z10;
        zcVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.f28240z == l61Var2.f28240z && l61Var.d == l61Var2.d && TextUtils.equals(l61Var.f28228m, l61Var2.f28228m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new zc(context, g6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }
}
