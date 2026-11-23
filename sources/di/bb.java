package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o80;
public final class bb extends m41 {
    public static final int f8566b = 0;

    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        n41 K = n41.K(bb.class);
        K.d = i7;
        K.A = i10;
        long j3 = tL_starsTopupOption.stars;
        K.C = j3;
        K.f37655m = gd.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f37656n = f10;
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        float f10;
        cb cbVar = (cb) view;
        int i7 = n41Var.A;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        org.telegram.ui.Components.n6 n6Var = cbVar.f8618e;
        TextView textView = cbVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        cbVar.f8620n = i7;
        if (!equals) {
            cbVar.f8621r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (cbVar.f8619f == null) {
                SpannableString spannableString = new SpannableString("x");
                cbVar.f8619f = spannableString;
                spannableString.setSpan(new o80(org.telegram.messenger.g0.L(55.0f), n6Var), 0, cbVar.f8619f.length(), 33);
            }
            charSequence2 = cbVar.f8619f;
        }
        n6Var.setText(charSequence2);
        if (gd.f24314a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(kr.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        cbVar.h = z10;
        cbVar.invalidate();
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.A == n41Var2.A && n41Var.d == n41Var2.d && TextUtils.equals(n41Var.f37656n, n41Var2.f37656n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new cb(context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }
}
