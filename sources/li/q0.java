package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class q0 extends q31 {
    public static final int f18781b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        boolean z10;
        float f10;
        r0 r0Var = (r0) view;
        a aVar = (a) r31Var.G;
        b3 b3Var = (b3) r31Var.H;
        g1 g1Var = r0Var.d;
        boolean z11 = false;
        if (r0Var.f18803f != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0Var.f18803f = aVar;
        r0Var.h = b3Var;
        TL_iv.PageBlock pageBlock = aVar.f18389b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = r0Var.f18801c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = c6.r(pageblockdetails.title, null, true);
            if (!aVar.f18404s) {
                aVar.f18404s = true;
                if (r10.length() == 0 || (c6.q(0, r10.length(), r10) & 1) != 0) {
                    z11 = true;
                }
                aVar.f18403r = z11;
            }
            g1Var.setAutoBold(aVar.f18403r);
            if (!z10 && String.valueOf(g1Var.getText()).equals(c6.l(pageblockdetails.title))) {
                return;
            }
            g1Var.setTextSilently(r10);
            g1Var.f();
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new r0(context, f6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
