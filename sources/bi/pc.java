package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
public final class pc extends x31 {
    public static final int f4545b = 0;

    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        y31 K = y31.K(pc.class);
        K.d = i7;
        K.f40581z = i10;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.f40568l = org.telegram.messenger.id.H(' ', "StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f40569m = f10;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        float f10;
        qc qcVar = (qc) view;
        int i7 = y31Var.f40581z;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
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
                spannableString.setSpan(new c80(org.telegram.messenger.g0.L(55.0f), j6Var), 0, qcVar.f4594f.length(), 33);
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
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.f40581z == y31Var2.f40581z && y31Var.d == y31Var2.d && TextUtils.equals(y31Var.f40569m, y31Var2.f40569m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new qc(context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }
}
