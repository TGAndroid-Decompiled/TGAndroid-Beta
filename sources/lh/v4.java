package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class v4 extends i51 {
    public static final int f13051a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) j51Var.G;
        int i10 = j51Var.f28027z;
        String str = (String) j51Var.f28014l;
        boolean z10 = j51Var.f28008e;
        lj0 lj0Var = w4Var.f21375c;
        u4 u4Var = w4Var.K;
        if (u4Var == null || w4Var.J != stargiftattributemodel.document.f20849id) {
            w4Var.J = stargiftattributemodel.document.f20849id;
            if (u4Var != null) {
                u4Var.o(lj0Var);
            }
            w4Var.K = new org.telegram.ui.Components.l5(3, w4Var.I, stargiftattributemodel.document);
        }
        if (lj0Var.isAttachedToWindow()) {
            w4Var.K.a(lj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, w4Var.C);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        w4Var.g(spannableStringBuilder, 0, w4Var.K);
        w4Var.setChecked(z10);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new w4(context, i10, g6Var);
    }
}
