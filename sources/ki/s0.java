package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class s0 extends g61 {
    public static final int f15497a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        float f7;
        t0 t0Var = (t0) view;
        a aVar = (a) h61Var.G;
        d3 d3Var = (d3) h61Var.H;
        h1 h1Var = t0Var.d;
        boolean z12 = false;
        if (t0Var.f15522f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        t0Var.f15522f = aVar;
        t0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.f15095b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = t0Var.f15521c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = e6.r(pageblockdetails.title, null, true);
            if (!aVar.f15109s) {
                aVar.f15109s = true;
                if (r10.length() == 0 || (e6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f15108r = z12;
            }
            h1Var.setAutoBold(aVar.f15108r);
            if (!z11 && String.valueOf(h1Var.getText()).equals(e6.l(pageblockdetails.title))) {
                return;
            }
            h1Var.setTextSilently(r10);
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new t0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
