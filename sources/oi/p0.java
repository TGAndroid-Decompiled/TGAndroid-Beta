package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class p0 extends m41 {
    public static final int f22372b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        float f10;
        q0 q0Var = (q0) view;
        a aVar = (a) n41Var.H;
        c3 c3Var = (c3) n41Var.I;
        f1 f1Var = q0Var.d;
        boolean z12 = false;
        if (q0Var.f22391f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f22391f = aVar;
        q0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.f22001b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = q0Var.f22389c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = c6.r(pageblockdetails.title, null, true);
            if (!aVar.f22016s) {
                aVar.f22016s = true;
                if (r10.length() == 0 || (c6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f22015r = z12;
            }
            f1Var.setAutoBold(aVar.f22015r);
            if (!z11 && String.valueOf(f1Var.getText()).equals(c6.l(pageblockdetails.title))) {
                return;
            }
            f1Var.setTextSilently(r10);
            f1Var.f();
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new q0(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
