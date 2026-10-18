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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class xc extends e61 {
    public static final int f2455a = 0;

    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        f61 J = f61.J(xc.class);
        J.d = i10;
        J.f26153z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f26140l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26141m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        float f7;
        yc ycVar = (yc) view;
        int i10 = f61Var.f26153z;
        CharSequence charSequence = f61Var.f26140l;
        CharSequence charSequence2 = f61Var.f26141m;
        org.telegram.ui.Components.q6 q6Var = ycVar.e;
        TextView textView = ycVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        ycVar.f2513n = i10;
        if (!equals) {
            ycVar.f2514r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (ycVar.f2512f == null) {
                SpannableString spannableString = new SpannableString("x");
                ycVar.f2512f = spannableString;
                spannableString.setSpan(new ca0(AndroidUtilities.dp(55.0f), q6Var), 0, ycVar.f2512f.length(), 33);
            }
            charSequence2 = ycVar.f2512f;
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
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (f61Var.f26153z == f61Var2.f26153z && f61Var.d == f61Var2.d && TextUtils.equals(f61Var.f26141m, f61Var2.f26141m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new yc(context, d6Var);
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.d == f61Var2.d) {
            return true;
        }
        return false;
    }
}
