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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class xc extends f61 {
    public static final int f2460a = 0;

    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        g61 J = g61.J(xc.class);
        J.d = i10;
        J.f26510z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f26497l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26498m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        float f7;
        yc ycVar = (yc) view;
        int i10 = g61Var.f26510z;
        CharSequence charSequence = g61Var.f26497l;
        CharSequence charSequence2 = g61Var.f26498m;
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
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.f26510z == g61Var2.f26510z && g61Var.d == g61Var2.d && TextUtils.equals(g61Var.f26498m, g61Var2.f26498m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new yc(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }
}
