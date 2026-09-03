package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class u4 extends h51 {
    public static final int f10976a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        v4 v4Var = (v4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) i51Var.G;
        int i10 = i51Var.f25598z;
        String str = (String) i51Var.f25585l;
        boolean z10 = i51Var.e;
        jj0 jj0Var = v4Var.f19679c;
        t4 t4Var = v4Var.K;
        if (t4Var == null || v4Var.J != stargiftattributemodel.document.f19165id) {
            v4Var.J = stargiftattributemodel.document.f19165id;
            if (t4Var != null) {
                t4Var.o(jj0Var);
            }
            v4Var.K = new org.telegram.ui.Components.l5(3, v4Var.I, stargiftattributemodel.document);
        }
        if (jj0Var.isAttachedToWindow()) {
            v4Var.K.a(jj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, v4Var.C);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        v4Var.g(spannableStringBuilder, 0, v4Var.K);
        v4Var.setChecked(z10);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new v4(context, i10, f6Var);
    }
}
