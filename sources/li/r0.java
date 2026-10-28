package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class r0 extends t61 {
    public static final int f17438a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        boolean z11;
        float f7;
        s0 s0Var = (s0) view;
        a aVar = (a) u61Var.G;
        c3 c3Var = (c3) u61Var.H;
        g1 g1Var = s0Var.d;
        boolean z12 = false;
        if (s0Var.f17462f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        s0Var.f17462f = aVar;
        s0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.f17053b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = s0Var.f17461c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r6 = f6.r(pageblockdetails.title, null, true);
            if (!aVar.f17067s) {
                aVar.f17067s = true;
                if (r6.length() == 0 || (f6.q(0, r6.length(), r6) & 1) != 0) {
                    z12 = true;
                }
                aVar.f17066r = z12;
            }
            g1Var.setAutoBold(aVar.f17066r);
            if (!z11 && String.valueOf(g1Var.getText()).equals(f6.l(pageblockdetails.title))) {
                return;
            }
            g1Var.setTextSilently(r6);
            g1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new s0(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
