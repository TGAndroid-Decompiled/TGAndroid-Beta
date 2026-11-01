package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class x0 extends a51 {
    public static final int f3444b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        float f7;
        y0 y0Var = (y0) view;
        a aVar = (a) b51Var.G;
        l3 l3Var = (l3) b51Var.H;
        n1 n1Var = y0Var.d;
        boolean z12 = false;
        if (y0Var.f3457f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        y0Var.f3457f = aVar;
        y0Var.h = l3Var;
        TL_iv.PageBlock pageBlock = aVar.f2818b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = y0Var.f3456c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = s6.r(pageblockdetails.title, null, true);
            if (!aVar.f2832s) {
                aVar.f2832s = true;
                if (r10.length() == 0 || (s6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f2831r = z12;
            }
            n1Var.setAutoBold(aVar.f2831r);
            if (!z11 && String.valueOf(n1Var.getText()).equals(s6.l(pageblockdetails.title))) {
                return;
            }
            n1Var.setTextSilently(r10);
            n1Var.f();
        }
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new y0(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
