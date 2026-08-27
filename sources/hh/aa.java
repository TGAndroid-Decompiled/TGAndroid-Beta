package hh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.zk0;

public final class aa extends m41 {

    public static final int f8969a = 0;

    static {
        m41.setup(new aa());
    }

    public static n41 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        n41 n41VarJ = n41.J(aa.class);
        n41VarJ.d = i10;
        n41VarJ.f30857z = i11;
        long j10 = tL_starsTopupOption.stars;
        n41VarJ.B = j10;
        n41VarJ.f30844l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        n41VarJ.f30845m = tL_starsTopupOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        n41VarJ.G = tL_starsTopupOption;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ba baVar = (ba) view;
        int i10 = n41Var.f30857z;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        org.telegram.ui.Components.j6 j6Var = baVar.f9028e;
        TextView textView = baVar.d;
        boolean zEquals = TextUtils.equals(textView.getText(), charSequence);
        baVar.f9030n = i10;
        if (!zEquals) {
            baVar.f9031r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (baVar.f9029f == null) {
                SpannableString spannableString = new SpannableString("x");
                baVar.f9029f = spannableString;
                spannableString.setSpan(new u80(AndroidUtilities.dp(55.0f), j6Var), 0, baVar.f9029f.length(), 33);
            }
            charSequence2 = baVar.f9029f;
        }
        j6Var.setText(charSequence2);
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        if (zEquals) {
            textView.animate().translationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(er.h).start();
        } else {
            textView.setTranslationX(f10 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        baVar.h = z10;
        baVar.invalidate();
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.f30857z == n41Var2.f30857z && n41Var.d == n41Var2.d && TextUtils.equals(n41Var.f30845m, n41Var2.f30845m);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new ba(context, c6Var);
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
