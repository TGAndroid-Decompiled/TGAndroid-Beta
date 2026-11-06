package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.xq;
public final class pc extends v31 {
    public static final int f4545b = 0;

    static {
        v31.h(new v31());
    }

    public static w31 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        w31 K = w31.K(pc.class);
        K.d = i7;
        K.f39843z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.f39830l = org.telegram.messenger.hd.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f39831m = f10;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        float f10;
        qc qcVar = (qc) view;
        int i7 = w31Var.f39843z;
        CharSequence charSequence = w31Var.f39830l;
        CharSequence charSequence2 = w31Var.f39831m;
        org.telegram.ui.Components.j6 j6Var = qcVar.f4593e;
        TextView textView = qcVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        qcVar.f4595n = i7;
        if (!equals) {
            qcVar.f4596r.e(true, i7);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (qcVar.f4594f == null) {
                SpannableString spannableString = new SpannableString("x");
                qcVar.f4594f = spannableString;
                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(55.0f), j6Var), 0, qcVar.f4594f.length(), 33);
            }
            charSequence2 = qcVar.f4594f;
        }
        j6Var.setText(charSequence2);
        if (org.telegram.messenger.hd.f22871a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(xq.h).start();
        } else {
            textView.setTranslationX(f10 * (i7 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        qcVar.h = z9;
        qcVar.invalidate();
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (w31Var.f39843z == w31Var2.f39843z && w31Var.d == w31Var2.d && TextUtils.equals(w31Var.f39831m, w31Var2.f39831m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new qc(context, f6Var);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d) {
            return true;
        }
        return false;
    }
}
