package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.z41;
public final class p7 extends k41 {
    public static final int f3977b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        q7 q7Var = (q7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l41Var.H;
        int i7 = l41Var.A;
        String str = (String) l41Var.f37018m;
        boolean z11 = l41Var.f37011e;
        ph0 ph0Var = q7Var.f30305c;
        o7 o7Var = q7Var.f4015b0;
        if (o7Var == null || q7Var.f4014a0 != stargiftattributemodel.document.f28411id) {
            q7Var.f4014a0 = stargiftattributemodel.document.f28411id;
            if (o7Var != null) {
                o7Var.n(ph0Var);
            }
            q7Var.f4015b0 = new org.telegram.ui.Components.o5(3, q7Var.W, stargiftattributemodel.document);
        }
        if (ph0Var.isAttachedToWindow()) {
            q7Var.f4015b0.a(ph0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, q7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new i41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q7Var.j(spannableStringBuilder, 0, q7Var.f4015b0);
        q7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new q7(i7, context, i6Var);
    }
}
