package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class t0 extends p61 {
    public static final int f12700a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) q61Var.G;
        e3 e3Var = (e3) q61Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f12725f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f12725f = aVar;
        u0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.f12233b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f12723c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = h6.r(pageblockdetails.title, null, true);
            if (!aVar.f12248s) {
                aVar.f12248s = true;
                if (r10.length() == 0 || (h6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f12247r = z12;
            }
            i1Var.setAutoBold(aVar.f12247r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(h6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
