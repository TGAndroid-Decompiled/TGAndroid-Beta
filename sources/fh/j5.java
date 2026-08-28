package fh;

import android.content.Context;
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
public final class j5 extends k41 {
    public static final int f6556a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        k5 k5Var = (k5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l41Var.G;
        int i9 = l41Var.f30352z;
        String str = (String) l41Var.f30339l;
        boolean z11 = l41Var.f30333e;
        pi0 pi0Var = k5Var.f23405c;
        i5 i5Var = k5Var.J;
        if (i5Var == null || k5Var.I != stargiftattributemodel.document.f22386id) {
            k5Var.I = stargiftattributemodel.document.f22386id;
            if (i5Var != null) {
                i5Var.o(pi0Var);
            }
            k5Var.J = new org.telegram.ui.Components.k5(3, k5Var.H, stargiftattributemodel.document);
        }
        if (pi0Var.isAttachedToWindow()) {
            k5Var.J.a(pi0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, k5Var.B);
        }
        if (i9 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i9));
            spannableStringBuilder2.setSpan(new i41(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        k5Var.g(spannableStringBuilder, 0, k5Var.J);
        k5Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new k5(context, i9, b6Var);
    }
}
