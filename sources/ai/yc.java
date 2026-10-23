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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class yc extends l61 {
    public static final int f2523a = 0;

    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        m61 J = m61.J(yc.class);
        J.d = i10;
        J.f28572z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f28559l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f28560m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        float f7;
        zc zcVar = (zc) view;
        int i10 = m61Var.f28572z;
        CharSequence charSequence = m61Var.f28559l;
        CharSequence charSequence2 = m61Var.f28560m;
        org.telegram.ui.Components.q6 q6Var = zcVar.e;
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
                spannableString.setSpan(new da0(AndroidUtilities.dp(55.0f), q6Var), 0, zcVar.f2560f.length(), 33);
            }
            charSequence2 = zcVar.f2560f;
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
        zcVar.h = z10;
        zcVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.f28572z == m61Var2.f28572z && m61Var.d == m61Var2.d && TextUtils.equals(m61Var.f28560m, m61Var2.f28560m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new zc(context, g6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }
}
