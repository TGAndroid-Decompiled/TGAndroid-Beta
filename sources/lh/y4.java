package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class y4 extends g51 {
    public static final int f13126a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        z4 z4Var = (z4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) h51Var.G;
        int i10 = h51Var.f27388z;
        String str = (String) h51Var.f27375l;
        boolean z10 = h51Var.f27369e;
        g6 g6Var = z4Var.C;
        kj0 kj0Var = z4Var.f21377c;
        x4 x4Var = z4Var.K;
        if (x4Var == null || z4Var.J != stargiftattributepattern.document.f20851id) {
            z4Var.J = stargiftattributepattern.document.f20851id;
            if (x4Var != null) {
                x4Var.o(kj0Var);
            }
            ?? l5Var = new org.telegram.ui.Components.l5(3, z4Var.I, stargiftattributepattern.document);
            z4Var.K = l5Var;
            l5Var.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.E8, g6Var), PorterDuff.Mode.SRC_IN));
        }
        if (kj0Var.isAttachedToWindow()) {
            z4Var.K.a(kj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, g6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        z4Var.g(spannableStringBuilder, 0, z4Var.K);
        z4Var.setChecked(z10);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new z4(context, i10, g6Var);
    }
}
