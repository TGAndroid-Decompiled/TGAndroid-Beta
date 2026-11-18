package bi;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class r7 extends k41 {
    public static final int f4014b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        s7 s7Var = (s7) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l41Var.H;
        int i7 = l41Var.A;
        String str = (String) l41Var.f37018m;
        boolean z11 = l41Var.f37011e;
        org.telegram.ui.ActionBar.i6 i6Var = s7Var.P;
        ph0 ph0Var = s7Var.f30303c;
        q7 q7Var = s7Var.f4040b0;
        if (q7Var == null || s7Var.f4039a0 != stargiftattributepattern.document.f28409id) {
            s7Var.f4039a0 = stargiftattributepattern.document.f28409id;
            if (q7Var != null) {
                q7Var.n(ph0Var);
            }
            ?? o5Var = new org.telegram.ui.Components.o5(3, s7Var.W, stargiftattributepattern.document);
            s7Var.f4040b0 = o5Var;
            org.telegram.ui.ActionBar.u6.x(s7Var, o5Var, org.telegram.ui.ActionBar.n6.E8, i6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ph0Var.isAttachedToWindow()) {
            s7Var.f4040b0.a(ph0Var);
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
            spannableStringBuilder2.setSpan(new i41(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        s7Var.j(spannableStringBuilder, 0, s7Var.f4040b0);
        s7Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new s7(i7, context, i6Var);
    }
}
