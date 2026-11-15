package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class xa extends a41 {
    public static final int f9743b = 0;

    static {
        a41.h(new a41());
    }

    public static b41 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        b41 K = b41.K(xa.class);
        K.d = i7;
        K.f33197z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.f33184l = hd.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f33185m = f10;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        float f10;
        ya yaVar = (ya) view;
        int i7 = b41Var.f33197z;
        CharSequence charSequence = b41Var.f33184l;
        CharSequence charSequence2 = b41Var.f33185m;
        org.telegram.ui.Components.h6 h6Var = yaVar.f9803e;
        TextView textView = yaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        yaVar.f9805n = i7;
        if (!equals) {
            yaVar.f9806r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (yaVar.f9804f == null) {
                SpannableString spannableString = new SpannableString("x");
                yaVar.f9804f = spannableString;
                spannableString.setSpan(new e80(org.telegram.messenger.g0.L(55.0f), h6Var), 0, yaVar.f9804f.length(), 33);
            }
            charSequence2 = yaVar.f9804f;
        }
        h6Var.setText(charSequence2);
        if (hd.f24104a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(er.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        yaVar.h = z10;
        yaVar.invalidate();
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.f33197z == b41Var2.f33197z && b41Var.d == b41Var2.d && TextUtils.equals(b41Var.f33185m, b41Var2.f33185m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ya(context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }
}
