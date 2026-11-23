package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r80;
public final class bb extends n41 {
    public static final int f8604b = 0;

    static {
        n41.h(new n41());
    }

    public static o41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        o41 K = o41.K(bb.class);
        K.d = i7;
        K.A = i10;
        long j3 = tL_starsTopupOption.stars;
        K.C = j3;
        K.f38091m = hd.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f38092n = f10;
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        float f10;
        cb cbVar = (cb) view;
        int i7 = o41Var.A;
        CharSequence charSequence = o41Var.f38091m;
        CharSequence charSequence2 = o41Var.f38092n;
        org.telegram.ui.Components.o6 o6Var = cbVar.f8657e;
        TextView textView = cbVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        cbVar.f8659n = i7;
        if (!equals) {
            cbVar.f8660r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (cbVar.f8658f == null) {
                SpannableString spannableString = new SpannableString("x");
                cbVar.f8658f = spannableString;
                spannableString.setSpan(new r80(org.telegram.messenger.g0.L(55.0f), o6Var), 0, cbVar.f8658f.length(), 33);
            }
            charSequence2 = cbVar.f8658f;
        }
        o6Var.setText(charSequence2);
        if (hd.f24444a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(nr.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        cbVar.h = z10;
        cbVar.invalidate();
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.A == o41Var2.A && o41Var.d == o41Var2.d && TextUtils.equals(o41Var.f38092n, o41Var2.f38092n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new cb(context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }
}
