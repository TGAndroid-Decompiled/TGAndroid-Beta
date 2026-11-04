package ai;

import android.content.Context;
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
public final class q5 extends q31 {
    public static final int f928b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        r5 r5Var = (r5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) r31Var.G;
        int i3 = r31Var.f37640z;
        String str = (String) r31Var.f37627l;
        boolean z11 = r31Var.f37621e;
        fh0 fh0Var = r5Var.f28814c;
        p5 p5Var = r5Var.f950b0;
        if (p5Var == null || r5Var.f949a0 != stargiftattributemodel.document.f27007id) {
            r5Var.f949a0 = stargiftattributemodel.document.f27007id;
            if (p5Var != null) {
                p5Var.n(fh0Var);
            }
            r5Var.f950b0 = new org.telegram.ui.Components.g5(3, r5Var.W, stargiftattributemodel.document);
        }
        if (fh0Var.isAttachedToWindow()) {
            r5Var.f950b0.a(fh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, r5Var.P);
        }
        if (i3 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i3));
            spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        r5Var.j(spannableStringBuilder, 0, r5Var.f950b0);
        r5Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r5(i3, context, e6Var);
    }
}
