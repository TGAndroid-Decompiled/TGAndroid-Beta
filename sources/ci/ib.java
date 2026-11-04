package ci;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
public final class ib extends q31 {
    public static final int f5317b = 0;

    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, int i10, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f10;
        r31 K = r31.K(ib.class);
        K.d = i3;
        K.f37640z = i10;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.f37627l = bd.H(' ', "StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            f10 = null;
        } else {
            f10 = org.telegram.messenger.r1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f37628m = f10;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        float f10;
        jb jbVar = (jb) view;
        int i3 = r31Var.f37640z;
        CharSequence charSequence = r31Var.f37627l;
        CharSequence charSequence2 = r31Var.f37628m;
        org.telegram.ui.Components.h6 h6Var = jbVar.f5356e;
        TextView textView = jbVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        jbVar.f5358n = i3;
        if (!equals) {
            jbVar.f5359r.e(true, i3);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (jbVar.f5357f == null) {
                SpannableString spannableString = new SpannableString("x");
                jbVar.f5357f = spannableString;
                spannableString.setSpan(new x70(org.telegram.messenger.g0.L(55.0f), h6Var), 0, jbVar.f5357f.length(), 33);
            }
            charSequence2 = jbVar.f5357f;
        }
        h6Var.setText(charSequence2);
        if (bd.f21784a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f10 * (i3 - 1) * org.telegram.messenger.g0.L(2.66f)).setDuration(320L).setInterpolator(xq.h).start();
        } else {
            textView.setTranslationX(f10 * (i3 - 1) * org.telegram.messenger.g0.L(2.66f));
        }
        jbVar.h = z10;
        jbVar.invalidate();
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.f37640z == r31Var2.f37640z && r31Var.d == r31Var2.d && TextUtils.equals(r31Var.f37628m, r31Var2.f37628m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new jb(context, e6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }
}
