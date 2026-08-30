package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class y4 extends h51 {
    public static final int f10964a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        z4 z4Var = (z4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) i51Var.G;
        int i10 = i51Var.f25578z;
        String str = (String) i51Var.f25565l;
        boolean z10 = i51Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = z4Var.C;
        jj0 jj0Var = z4Var.f19704c;
        x4 x4Var = z4Var.K;
        if (x4Var == null || z4Var.J != stargiftattributepattern.document.f19190id) {
            z4Var.J = stargiftattributepattern.document.f19190id;
            if (x4Var != null) {
                x4Var.o(jj0Var);
            }
            ?? l5Var = new org.telegram.ui.Components.l5(3, z4Var.I, stargiftattributepattern.document);
            z4Var.K = l5Var;
            l5Var.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (jj0Var.isAttachedToWindow()) {
            z4Var.K.a(jj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, f6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        z4Var.g(spannableStringBuilder, 0, z4Var.K);
        z4Var.setChecked(z10);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new z4(context, i10, f6Var);
    }
}
