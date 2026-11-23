package bi;

import android.content.Context;
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
public final class u7 extends m41 {
    public static final int f4127b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        v7 v7Var = (v7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) n41Var.H;
        int i7 = n41Var.A;
        String str = (String) n41Var.f37655m;
        boolean z11 = n41Var.f37648e;
        qh0 qh0Var = v7Var.f30346c;
        t7 t7Var = v7Var.f4160b0;
        if (t7Var == null || v7Var.f4159a0 != stargiftattributemodel.document.f28498id) {
            v7Var.f4159a0 = stargiftattributemodel.document.f28498id;
            if (t7Var != null) {
                t7Var.n(qh0Var);
            }
            v7Var.f4160b0 = new org.telegram.ui.Components.o5(3, v7Var.W, stargiftattributemodel.document);
        }
        if (qh0Var.isAttachedToWindow()) {
            v7Var.f4160b0.a(qh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, v7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        v7Var.j(spannableStringBuilder, 0, v7Var.f4160b0);
        v7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new v7(i7, context, i6Var);
    }
}
