package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class s0 extends l61 {
    public static final int f13510a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        float f7;
        t0 t0Var = (t0) view;
        a aVar = (a) m61Var.G;
        e3 e3Var = (e3) m61Var.H;
        h1 h1Var = t0Var.d;
        boolean z12 = false;
        if (t0Var.f13524f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        t0Var.f13524f = aVar;
        t0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.f13107b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = t0Var.f13523c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = k6.r(pageblockdetails.title, null, true);
            if (!aVar.f13121s) {
                aVar.f13121s = true;
                if (r10.length() == 0 || (k6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f13120r = z12;
            }
            h1Var.setAutoBold(aVar.f13120r);
            if (!z11 && String.valueOf(h1Var.getText()).equals(k6.l(pageblockdetails.title))) {
                return;
            }
            h1Var.setTextSilently(r10);
            h1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
