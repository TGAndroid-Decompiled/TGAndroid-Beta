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
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class oc extends s61 {
    public static final int f5214a = 0;

    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        t61 K = t61.K(oc.class);
        K.d = i10;
        K.f32885z = i11;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.f32872l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f32873m = formatCurrency;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        float f7;
        pc pcVar = (pc) view;
        int i10 = t61Var.f32885z;
        CharSequence charSequence = t61Var.f32872l;
        CharSequence charSequence2 = t61Var.f32873m;
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
                spannableString.setSpan(new ea0(AndroidUtilities.dp(55.0f), s6Var), 0, pcVar.f5249f.length(), 33);
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
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.f32885z == t61Var2.f32885z && t61Var.d == t61Var2.d && TextUtils.equals(t61Var.f32873m, t61Var2.f32873m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new pc(context, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            return true;
        }
        return false;
    }
}
