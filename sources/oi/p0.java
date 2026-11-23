package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class p0 extends n41 {
    public static final int f22306b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        float f10;
        q0 q0Var = (q0) view;
        a aVar = (a) o41Var.H;
        c3 c3Var = (c3) o41Var.I;
        f1 f1Var = q0Var.d;
        boolean z12 = false;
        if (q0Var.f22326f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f22326f = aVar;
        q0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.f21935b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = q0Var.f22324c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = c6.r(pageblockdetails.title, null, true);
            if (!aVar.f21950s) {
                aVar.f21950s = true;
                if (r10.length() == 0 || (c6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f21949r = z12;
            }
            f1Var.setAutoBold(aVar.f21949r);
            if (!z11 && String.valueOf(f1Var.getText()).equals(c6.l(pageblockdetails.title))) {
                return;
            }
            f1Var.setTextSilently(r10);
            f1Var.f();
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new q0(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
