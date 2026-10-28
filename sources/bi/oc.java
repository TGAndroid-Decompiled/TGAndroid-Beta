package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class oc extends t61 {
    public static final int f5214a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        u61 K = u61.K(oc.class);
        K.d = i10;
        K.f33262z = i11;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.f33249l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f33250m = formatCurrency;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        float f7;
        pc pcVar = (pc) view;
        int i10 = u61Var.f33262z;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        org.telegram.ui.Components.s6 s6Var = pcVar.e;
        TextView textView = pcVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        pcVar.f5250n = i10;
        if (!equals) {
            pcVar.f5251r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (pcVar.f5249f == null) {
                SpannableString spannableString = new SpannableString("x");
                pcVar.f5249f = spannableString;
                spannableString.setSpan(new fa0(AndroidUtilities.dp(55.0f), s6Var), 0, pcVar.f5249f.length(), 33);
            }
            charSequence2 = pcVar.f5249f;
        }
        s6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(ds.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        pcVar.h = z10;
        pcVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.f33262z == u61Var2.f33262z && u61Var.d == u61Var2.d && TextUtils.equals(u61Var.f33250m, u61Var2.f33250m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new pc(context, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }
}
