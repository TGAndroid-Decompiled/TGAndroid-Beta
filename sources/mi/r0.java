package mi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class r0 extends q31 {
    public static final int f19849b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        float f10;
        s0 s0Var = (s0) view;
        a aVar = (a) r31Var.G;
        c3 c3Var = (c3) r31Var.H;
        h1 h1Var = s0Var.d;
        boolean z12 = false;
        if (s0Var.f19875f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        s0Var.f19875f = aVar;
        s0Var.h = c3Var;
        TL_iv.PageBlock pageBlock = aVar.f19431b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = s0Var.f19873c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r5 = d6.r(pageblockdetails.title, null, true);
            if (!aVar.f19446s) {
                aVar.f19446s = true;
                if (r5.length() == 0 || (d6.q(0, r5.length(), r5) & 1) != 0) {
                    z12 = true;
                }
                aVar.f19445r = z12;
            }
            h1Var.setAutoBold(aVar.f19445r);
            if (!z11 && String.valueOf(h1Var.getText()).equals(d6.l(pageblockdetails.title))) {
                return;
            }
            h1Var.setTextSilently(r5);
            h1Var.f();
        }
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new s0(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
