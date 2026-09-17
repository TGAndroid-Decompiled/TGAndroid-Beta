package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class s0 extends g51 {
    public static final int f14183a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        float f7;
        t0 t0Var = (t0) view;
        a aVar = (a) h51Var.G;
        c3 c3Var = (c3) h51Var.H;
        h1 h1Var = t0Var.d;
        boolean z12 = false;
        if (t0Var.f14207f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        t0Var.f14207f = aVar;
        t0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.f13758b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = t0Var.f14205c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = i6.r(pageblockdetails.title, null, true);
            if (!aVar.f13773s) {
                aVar.f13773s = true;
                aVar.f13772r = (r10.length() == 0 || (i6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            h1Var.setAutoBold(aVar.f13772r);
            if (!z11 && String.valueOf(h1Var.getText()).equals(i6.l(pageblockdetails.title))) {
                return;
            }
            h1Var.setTextSilently(r10);
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
