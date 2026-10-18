package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class s0 extends e61 {
    public static final int f15498a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        float f7;
        t0 t0Var = (t0) view;
        a aVar = (a) f61Var.G;
        d3 d3Var = (d3) f61Var.H;
        h1 h1Var = t0Var.d;
        boolean z12 = false;
        if (t0Var.f15523f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        t0Var.f15523f = aVar;
        t0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.f15096b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = t0Var.f15522c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = e6.r(pageblockdetails.title, null, true);
            if (!aVar.f15110s) {
                aVar.f15110s = true;
                if (r10.length() == 0 || (e6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f15109r = z12;
            }
            h1Var.setAutoBold(aVar.f15109r);
            if (!z11 && String.valueOf(h1Var.getText()).equals(e6.l(pageblockdetails.title))) {
                return;
            }
            h1Var.setTextSilently(r10);
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new t0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
