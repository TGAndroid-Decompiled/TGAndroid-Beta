package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class t0 extends g51 {
    public static final int f11622a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) h51Var.G;
        e3 e3Var = (e3) h51Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f11647f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f11647f = aVar;
        u0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.f11191b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f11646c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = g6.r(pageblockdetails.title, null, true);
            if (!aVar.f11205s) {
                aVar.f11205s = true;
                aVar.f11204r = (r10.length() == 0 || (g6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            i1Var.setAutoBold(aVar.f11204r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(g6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
