package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qh0;
public final class x7 extends m41 {
    public static final int f4221b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        y7 y7Var = (y7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) n41Var.H;
        int i7 = n41Var.A;
        String str = (String) n41Var.f37655m;
        boolean z11 = n41Var.f37648e;
        org.telegram.ui.ActionBar.i6 i6Var = y7Var.P;
        qh0 qh0Var = y7Var.f30346c;
        w7 w7Var = y7Var.f4271b0;
        if (w7Var == null || y7Var.f4270a0 != stargiftattributepattern.document.f28498id) {
            y7Var.f4270a0 = stargiftattributepattern.document.f28498id;
            if (w7Var != null) {
                w7Var.n(qh0Var);
            }
            ?? o5Var = new org.telegram.ui.Components.o5(3, y7Var.W, stargiftattributepattern.document);
            y7Var.f4271b0 = o5Var;
            org.telegram.ui.ActionBar.u6.x(y7Var, o5Var, org.telegram.ui.ActionBar.n6.E8, i6Var, PorterDuff.Mode.SRC_IN);
        }
        if (qh0Var.isAttachedToWindow()) {
            y7Var.f4271b0.a(qh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, i6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        y7Var.j(spannableStringBuilder, 0, y7Var.f4271b0);
        y7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new y7(i7, context, i6Var);
    }
}
