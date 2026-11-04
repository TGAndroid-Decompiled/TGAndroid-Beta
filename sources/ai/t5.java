package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class t5 extends q31 {
    public static final int f988b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        u5 u5Var = (u5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) r31Var.G;
        int i3 = r31Var.f37640z;
        String str = (String) r31Var.f37627l;
        boolean z11 = r31Var.f37621e;
        org.telegram.ui.ActionBar.e6 e6Var = u5Var.P;
        fh0 fh0Var = u5Var.f28814c;
        s5 s5Var = u5Var.f1022b0;
        if (s5Var == null || u5Var.f1021a0 != stargiftattributepattern.document.f27007id) {
            u5Var.f1021a0 = stargiftattributepattern.document.f27007id;
            if (s5Var != null) {
                s5Var.n(fh0Var);
            }
            ?? g5Var = new org.telegram.ui.Components.g5(3, u5Var.W, stargiftattributepattern.document);
            u5Var.f1022b0 = g5Var;
            org.telegram.ui.ActionBar.r6.y(u5Var, g5Var, org.telegram.ui.ActionBar.k6.E8, e6Var, PorterDuff.Mode.SRC_IN);
        }
        if (fh0Var.isAttachedToWindow()) {
            u5Var.f1022b0.a(fh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, e6Var);
        }
        if (i3 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i3));
            spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        u5Var.j(spannableStringBuilder, 0, u5Var.f1022b0);
        u5Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u5(i3, context, e6Var);
    }
}
