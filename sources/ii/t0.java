package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class t0 extends t61 {
    public static final int f12699a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) u61Var.G;
        e3 e3Var = (e3) u61Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f12726f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f12726f = aVar;
        u0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.f12232b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f12724c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = g6.r(pageblockdetails.title, null, true);
            if (!aVar.f12247s) {
                aVar.f12247s = true;
                if (r10.length() == 0 || (g6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f12246r = z12;
            }
            i1Var.setAutoBold(aVar.f12246r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(g6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new u0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
