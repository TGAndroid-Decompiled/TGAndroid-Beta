package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y31;
public final class l5 extends a41 {
    public static final int f3676b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        m5 m5Var = (m5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b41Var.G;
        int i7 = b41Var.f33194z;
        String str = (String) b41Var.f33181l;
        boolean z11 = b41Var.f33175e;
        org.telegram.ui.ActionBar.e6 e6Var = m5Var.P;
        fh0 fh0Var = m5Var.f29901c;
        k5 k5Var = m5Var.f3716b0;
        if (k5Var == null || m5Var.f3715a0 != stargiftattributepattern.document.f28057id) {
            m5Var.f3715a0 = stargiftattributepattern.document.f28057id;
            if (k5Var != null) {
                k5Var.n(fh0Var);
            }
            ?? g5Var = new org.telegram.ui.Components.g5(3, m5Var.W, stargiftattributepattern.document);
            m5Var.f3716b0 = g5Var;
            org.telegram.ui.ActionBar.q6.x(m5Var, g5Var, org.telegram.ui.ActionBar.j6.E8, e6Var, PorterDuff.Mode.SRC_IN);
        }
        if (fh0Var.isAttachedToWindow()) {
            m5Var.f3716b0.a(fh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, e6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        m5Var.j(spannableStringBuilder, 0, m5Var.f3716b0);
        m5Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new m5(i7, context, e6Var);
    }
}
