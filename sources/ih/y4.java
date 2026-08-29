package ih;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class y4 extends v41 {
    public static final int f9547a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        z4 z4Var = (z4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) w41Var.G;
        int i10 = w41Var.f34313z;
        String str = (String) w41Var.f34300l;
        boolean z11 = w41Var.f34294e;
        org.telegram.ui.ActionBar.c6 c6Var = z4Var.B;
        aj0 aj0Var = z4Var.f22965c;
        x4 x4Var = z4Var.J;
        if (x4Var == null || z4Var.I != stargiftattributepattern.document.f22398id) {
            z4Var.I = stargiftattributepattern.document.f22398id;
            if (x4Var != null) {
                x4Var.o(aj0Var);
            }
            ?? p5Var = new org.telegram.ui.Components.p5(3, z4Var.H, stargiftattributepattern.document);
            z4Var.J = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.E8, c6Var), PorterDuff.Mode.SRC_IN));
        }
        if (aj0Var.isAttachedToWindow()) {
            z4Var.J.a(aj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, c6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new t41(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        z4Var.g(spannableStringBuilder, 0, z4Var.J);
        z4Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new z4(context, i10, c6Var);
    }
}
