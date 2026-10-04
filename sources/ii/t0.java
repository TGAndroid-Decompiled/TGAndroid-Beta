package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class t0 extends f61 {
    public static final int f12653a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) g61Var.G;
        e3 e3Var = (e3) g61Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f12678f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f12678f = aVar;
        u0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.f12186b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f12676c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = h6.r(pageblockdetails.title, null, true);
            if (!aVar.f12201s) {
                aVar.f12201s = true;
                aVar.f12200r = (r10.length() == 0 || (h6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            i1Var.setAutoBold(aVar.f12200r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(h6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
