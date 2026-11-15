package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class o0 extends a41 {
    public static final int f21853b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        float f10;
        p0 p0Var = (p0) view;
        a aVar = (a) b41Var.G;
        z2 z2Var = (z2) b41Var.H;
        e1 e1Var = p0Var.d;
        boolean z12 = false;
        if (p0Var.f21869f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        p0Var.f21869f = aVar;
        p0Var.h = z2Var;
        TL_iv.PageBlock pageBlock = aVar.f21544b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = p0Var.f21867c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = a6.r(pageblockdetails.title, null, true);
            if (!aVar.f21559s) {
                aVar.f21559s = true;
                if (r10.length() == 0 || (a6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f21558r = z12;
            }
            e1Var.setAutoBold(aVar.f21558r);
            if (!z11 && String.valueOf(e1Var.getText()).equals(a6.l(pageblockdetails.title))) {
                return;
            }
            e1Var.setTextSilently(r10);
            e1Var.f();
        }
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new p0(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
