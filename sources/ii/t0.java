package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class t0 extends i51 {
    public static final int f11628a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) j51Var.G;
        d3 d3Var = (d3) j51Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f11652f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f11652f = aVar;
        u0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.f11204b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f11651c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = f6.r(pageblockdetails.title, null, true);
            if (!aVar.f11218s) {
                aVar.f11218s = true;
                aVar.f11217r = (r10.length() == 0 || (f6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            i1Var.setAutoBold(aVar.f11217r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(f6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
