package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class v0 extends u51 {
    public static final int f9905a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        float f7;
        w0 w0Var = (w0) view;
        a aVar = (a) v51Var.G;
        g3 g3Var = (g3) v51Var.H;
        k1 k1Var = w0Var.d;
        boolean z12 = false;
        if (w0Var.f9921f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        w0Var.f9921f = aVar;
        w0Var.h = g3Var;
        TL_iv.PageBlock pageBlock = aVar.f9421b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = w0Var.f9920c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = i6.r(pageblockdetails.title, null, true);
            if (!aVar.f9435s) {
                aVar.f9435s = true;
                aVar.f9434r = (r10.length() == 0 || (i6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            k1Var.setAutoBold(aVar.f9434r);
            if (!z11 && String.valueOf(k1Var.getText()).equals(i6.l(pageblockdetails.title))) {
                return;
            }
            k1Var.setTextSilently(r10);
            k1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
