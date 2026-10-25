package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class r0 extends s61 {
    public static final int f17439a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        float f7;
        s0 s0Var = (s0) view;
        a aVar = (a) t61Var.G;
        c3 c3Var = (c3) t61Var.H;
        g1 g1Var = s0Var.d;
        boolean z12 = false;
        if (s0Var.f17463f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        s0Var.f17463f = aVar;
        s0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.f17054b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = s0Var.f17462c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r6 = f6.r(pageblockdetails.title, null, true);
            if (!aVar.f17068s) {
                aVar.f17068s = true;
                if (r6.length() == 0 || (f6.q(0, r6.length(), r6) & 1) != 0) {
                    z12 = true;
                }
                aVar.f17067r = z12;
            }
            g1Var.setAutoBold(aVar.f17067r);
            if (!z11 && String.valueOf(g1Var.getText()).equals(f6.l(pageblockdetails.title))) {
                return;
            }
            g1Var.setTextSilently(r6);
            g1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new s0(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
