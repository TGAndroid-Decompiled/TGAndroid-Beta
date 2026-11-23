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
public final class o0 extends n41 {
    public static final int f22242b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        float f10;
        p0 p0Var = (p0) view;
        a aVar = (a) o41Var.H;
        b3 b3Var = (b3) o41Var.I;
        e1 e1Var = p0Var.d;
        boolean z12 = false;
        if (p0Var.f22263f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        p0Var.f22263f = aVar;
        p0Var.h = b3Var;
        TL_iv.PageBlock pageBlock = aVar.f21901b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = p0Var.f22261c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = b6.r(pageblockdetails.title, null, true);
            if (!aVar.f21916s) {
                aVar.f21916s = true;
                if (r10.length() == 0 || (b6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f21915r = z12;
            }
            e1Var.setAutoBold(aVar.f21915r);
            if (!z11 && String.valueOf(e1Var.getText()).equals(b6.l(pageblockdetails.title))) {
                return;
            }
            e1Var.setTextSilently(r10);
            e1Var.f();
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new p0(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
