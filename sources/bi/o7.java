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
public final class o7 extends k41 {
    public static final int f3921b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        p7 p7Var = (p7) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l41Var.H;
        int i7 = l41Var.A;
        String str = (String) l41Var.f37018m;
        boolean z11 = l41Var.f37011e;
        ph0 ph0Var = p7Var.f30303c;
        n7 n7Var = p7Var.f3953b0;
        if (n7Var == null || p7Var.f3952a0 != stargiftattributemodel.document.f28409id) {
            p7Var.f3952a0 = stargiftattributemodel.document.f28409id;
            if (n7Var != null) {
                n7Var.n(ph0Var);
            }
            p7Var.f3953b0 = new org.telegram.ui.Components.o5(3, p7Var.W, stargiftattributemodel.document);
        }
        if (ph0Var.isAttachedToWindow()) {
            p7Var.f3953b0.a(ph0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, p7Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new i41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        p7Var.j(spannableStringBuilder, 0, p7Var.f3953b0);
        p7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new p7(i7, context, i6Var);
    }
}
