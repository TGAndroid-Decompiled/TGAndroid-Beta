package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.z41;
public final class bb extends k41 {
    public static final int f8579b = 0;

    static {
        k41.h(new k41());
    }

    public static l41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        l41 K = l41.K(bb.class);
        K.d = i7;
        K.A = i10;
        long j3 = tL_starsTopupOption.stars;
        K.C = j3;
        K.f37018m = gd.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f37019n = f10;
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        float f10;
        cb cbVar = (cb) view;
        int i7 = l41Var.A;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        org.telegram.ui.Components.n6 n6Var = cbVar.f8630e;
        TextView textView = cbVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        cbVar.f8632n = i7;
        if (!equals) {
            cbVar.f8633r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (cbVar.f8631f == null) {
                SpannableString spannableString = new SpannableString("x");
                cbVar.f8631f = spannableString;
                spannableString.setSpan(new p80(org.telegram.messenger.g0.L(55.0f), n6Var), 0, cbVar.f8631f.length(), 33);
            }
            charSequence2 = cbVar.f8631f;
        }
        n6Var.setText(charSequence2);
        if (gd.f24216a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(lr.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        cbVar.h = z10;
        cbVar.invalidate();
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (l41Var.A == l41Var2.A && l41Var.d == l41Var2.d && TextUtils.equals(l41Var.f37019n, l41Var2.f37019n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new cb(context, i6Var);
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }
}
