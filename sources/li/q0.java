package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class q0 extends w31 {
    public static final int f18787b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        float f10;
        r0 r0Var = (r0) view;
        a aVar = (a) x31Var.G;
        b3 b3Var = (b3) x31Var.H;
        g1 g1Var = r0Var.d;
        boolean z11 = false;
        if (r0Var.f18809f != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0Var.f18809f = aVar;
        r0Var.h = b3Var;
        TL_iv.PageBlock pageBlock = aVar.f18395b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = r0Var.f18807c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = c6.r(pageblockdetails.title, null, true);
            if (!aVar.f18410s) {
                aVar.f18410s = true;
                if (r10.length() == 0 || (c6.q(0, r10.length(), r10) & 1) != 0) {
                    z11 = true;
                }
                aVar.f18409r = z11;
            }
            g1Var.setAutoBold(aVar.f18409r);
            if (!z10 && String.valueOf(g1Var.getText()).equals(c6.l(pageblockdetails.title))) {
                return;
            }
            g1Var.setTextSilently(r10);
            g1Var.f();
        }
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new r0(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
