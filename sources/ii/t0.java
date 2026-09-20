package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class t0 extends v51 {
    public static final int f11629a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) w51Var.G;
        d3 d3Var = (d3) w51Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f11653f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f11653f = aVar;
        u0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.f11205b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f11652c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = f6.r(pageblockdetails.title, null, true);
            if (!aVar.f11219s) {
                aVar.f11219s = true;
                aVar.f11218r = (r10.length() == 0 || (f6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            i1Var.setAutoBold(aVar.f11218r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(f6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
