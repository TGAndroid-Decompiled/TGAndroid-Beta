package gh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class aa extends k41 {
    public static final int f7811a = 0;

    static {
        k41.setup(new k41());
    }

    public static l41 a(int i9, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        l41 J = l41.J(aa.class);
        J.d = i9;
        J.f30352z = i10;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f30339l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f30340m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        float f10;
        ba baVar = (ba) view;
        int i9 = l41Var.f30352z;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        org.telegram.ui.Components.j6 j6Var = baVar.f7873e;
        TextView textView = baVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        baVar.f7875n = i9;
        if (!equals) {
            baVar.f7876r.d(i9, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (baVar.f7874f == null) {
                SpannableString spannableString = new SpannableString("x");
                baVar.f7874f = spannableString;
                spannableString.setSpan(new q80(AndroidUtilities.dp(55.0f), j6Var), 0, baVar.f7874f.length(), 33);
            }
            charSequence2 = baVar.f7874f;
        }
        j6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i9 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(gr.h).start();
        } else {
            textView.setTranslationX(f10 * (i9 - 1) * AndroidUtilities.dp(2.66f));
        }
        baVar.h = z10;
        baVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.f30352z == l41Var2.f30352z && l41Var.d == l41Var2.d && TextUtils.equals(l41Var.f30340m, l41Var2.f30340m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new ba(context, b6Var);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }
}
