package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class v4 extends g51 {
    public static final int f13053a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) h51Var.G;
        int i10 = h51Var.f27388z;
        String str = (String) h51Var.f27375l;
        boolean z10 = h51Var.f27369e;
        kj0 kj0Var = w4Var.f21377c;
        u4 u4Var = w4Var.K;
        if (u4Var == null || w4Var.J != stargiftattributemodel.document.f20851id) {
            w4Var.J = stargiftattributemodel.document.f20851id;
            if (u4Var != null) {
                u4Var.o(kj0Var);
            }
            w4Var.K = new org.telegram.ui.Components.l5(3, w4Var.I, stargiftattributemodel.document);
        }
        if (kj0Var.isAttachedToWindow()) {
            w4Var.K.a(kj0Var);
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
            spannableStringBuilder2.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        w4Var.g(spannableStringBuilder, 0, w4Var.K);
        w4Var.setChecked(z10);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new w4(context, i10, g6Var);
    }
}
