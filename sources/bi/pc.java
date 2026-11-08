package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
public final class pc extends w31 {
    public static final int f4545b = 0;

    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        x31 K = x31.K(pc.class);
        K.d = i7;
        K.f40193z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.f40180l = org.telegram.messenger.id.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f40181m = f10;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        float f10;
        qc qcVar = (qc) view;
        int i7 = x31Var.f40193z;
        CharSequence charSequence = x31Var.f40180l;
        CharSequence charSequence2 = x31Var.f40181m;
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
        if (org.telegram.messenger.id.f23157a0) {
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
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (x31Var.f40193z == x31Var2.f40193z && x31Var.d == x31Var2.d && TextUtils.equals(x31Var.f40181m, x31Var2.f40181m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new qc(context, f6Var);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.d == x31Var2.d) {
            return true;
        }
        return false;
    }
}
