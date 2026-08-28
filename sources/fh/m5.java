package fh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class m5 extends k41 {
    public static final int f6630a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        n5 n5Var = (n5) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) l41Var.G;
        int i9 = l41Var.f30352z;
        String str = (String) l41Var.f30339l;
        boolean z11 = l41Var.f30333e;
        org.telegram.ui.ActionBar.b6 b6Var = n5Var.B;
        pi0 pi0Var = n5Var.f23405c;
        l5 l5Var = n5Var.J;
        if (l5Var == null || n5Var.I != stargiftattributepattern.document.f22386id) {
            n5Var.I = stargiftattributepattern.document.f22386id;
            if (l5Var != null) {
                l5Var.o(pi0Var);
            }
            ?? k5Var = new org.telegram.ui.Components.k5(3, n5Var.H, stargiftattributepattern.document);
            n5Var.J = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var), PorterDuff.Mode.SRC_IN));
        }
        if (pi0Var.isAttachedToWindow()) {
            n5Var.J.a(pi0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, b6Var);
        }
        if (i9 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i9));
            spannableStringBuilder2.setSpan(new i41(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        n5Var.g(spannableStringBuilder, 0, n5Var.J);
        n5Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new n5(context, i9, b6Var);
    }
}
