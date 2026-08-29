package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class v4 extends v41 {
    public static final int f9460a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) w41Var.G;
        int i10 = w41Var.f34313z;
        String str = (String) w41Var.f34300l;
        boolean z11 = w41Var.f34294e;
        aj0 aj0Var = w4Var.f22965c;
        u4 u4Var = w4Var.J;
        if (u4Var == null || w4Var.I != stargiftattributemodel.document.f22398id) {
            w4Var.I = stargiftattributemodel.document.f22398id;
            if (u4Var != null) {
                u4Var.o(aj0Var);
            }
            w4Var.J = new org.telegram.ui.Components.p5(3, w4Var.H, stargiftattributemodel.document);
        }
        if (aj0Var.isAttachedToWindow()) {
            w4Var.J.a(aj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, w4Var.B);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new t41(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        w4Var.g(spannableStringBuilder, 0, w4Var.J);
        w4Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new w4(context, i10, c6Var);
    }
}
