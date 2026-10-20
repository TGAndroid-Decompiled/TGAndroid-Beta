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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class xc extends g61 {
    public static final int f2460a = 0;

    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        h61 J = h61.J(xc.class);
        J.d = i10;
        J.f26795z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f26782l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26783m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        float f7;
        yc ycVar = (yc) view;
        int i10 = h61Var.f26795z;
        CharSequence charSequence = h61Var.f26782l;
        CharSequence charSequence2 = h61Var.f26783m;
        org.telegram.ui.Components.q6 q6Var = ycVar.e;
        TextView textView = ycVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        ycVar.f2518n = i10;
        if (!equals) {
            ycVar.f2519r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (ycVar.f2517f == null) {
                SpannableString spannableString = new SpannableString("x");
                ycVar.f2517f = spannableString;
                spannableString.setSpan(new ca0(AndroidUtilities.dp(55.0f), q6Var), 0, ycVar.f2517f.length(), 33);
            }
            charSequence2 = ycVar.f2517f;
        }
        q6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(bs.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        ycVar.h = z10;
        ycVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.f26795z == h61Var2.f26795z && h61Var.d == h61Var2.d && TextUtils.equals(h61Var.f26783m, h61Var2.f26783m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new yc(context, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }
}
