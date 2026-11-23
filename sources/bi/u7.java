package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.rh0;
public final class u7 extends n41 {
    public static final int f4127b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        v7 v7Var = (v7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) o41Var.H;
        int i7 = o41Var.A;
        String str = (String) o41Var.f38058m;
        boolean z11 = o41Var.f38051e;
        rh0 rh0Var = v7Var.f30255c;
        t7 t7Var = v7Var.f4160b0;
        if (t7Var == null || v7Var.f4159a0 != stargiftattributemodel.document.f28404id) {
            v7Var.f4159a0 = stargiftattributemodel.document.f28404id;
            if (t7Var != null) {
                t7Var.n(rh0Var);
            }
            v7Var.f4160b0 = new org.telegram.ui.Components.p5(3, v7Var.W, stargiftattributemodel.document);
        }
        if (rh0Var.isAttachedToWindow()) {
            v7Var.f4160b0.a(rh0Var);
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
            spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        v7Var.j(spannableStringBuilder, 0, v7Var.f4160b0);
        v7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new v7(i7, context, h6Var);
    }
}
