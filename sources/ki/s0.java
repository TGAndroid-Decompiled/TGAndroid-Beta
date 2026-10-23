package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class s0 extends l61 {
    public static final int f15557a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        float f7;
        t0 t0Var = (t0) view;
        a aVar = (a) m61Var.G;
        d3 d3Var = (d3) m61Var.H;
        h1 h1Var = t0Var.d;
        boolean z12 = false;
        if (t0Var.f15582f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        t0Var.f15582f = aVar;
        t0Var.h = d3Var;
        TL_iv.PageBlock pageBlock = aVar.f15141b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = t0Var.f15581c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = e6.r(pageblockdetails.title, null, true);
            if (!aVar.f15155s) {
                aVar.f15155s = true;
                if (r10.length() == 0 || (e6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f15154r = z12;
            }
            h1Var.setAutoBold(aVar.f15154r);
            if (!z11 && String.valueOf(h1Var.getText()).equals(e6.l(pageblockdetails.title))) {
                return;
            }
            h1Var.setTextSilently(r10);
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new t0(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
