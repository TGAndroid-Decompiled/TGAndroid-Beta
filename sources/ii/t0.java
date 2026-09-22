package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class t0 extends x51 {
    public static final int f11629a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) y51Var.G;
        d3 d3Var = (d3) y51Var.H;
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
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
