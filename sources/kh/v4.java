package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class v4 extends h51 {
    public static final int f10897a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        w4 w4Var = (w4) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) i51Var.G;
        int i10 = i51Var.f25578z;
        String str = (String) i51Var.f25565l;
        boolean z10 = i51Var.e;
        jj0 jj0Var = w4Var.f19704c;
        u4 u4Var = w4Var.K;
        if (u4Var == null || w4Var.J != stargiftattributemodel.document.f19190id) {
            w4Var.J = stargiftattributemodel.document.f19190id;
            if (u4Var != null) {
                u4Var.o(jj0Var);
            }
            w4Var.K = new org.telegram.ui.Components.l5(3, w4Var.I, stargiftattributemodel.document);
        }
        if (jj0Var.isAttachedToWindow()) {
            w4Var.K.a(jj0Var);
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
            spannableStringBuilder2.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        w4Var.g(spannableStringBuilder, 0, w4Var.K);
        w4Var.setChecked(z10);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w4(context, i10, f6Var);
    }
}
