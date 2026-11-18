package oi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class o0 extends k41 {
    public static final int f22215b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        float f10;
        p0 p0Var = (p0) view;
        a aVar = (a) l41Var.H;
        b3 b3Var = (b3) l41Var.I;
        e1 e1Var = p0Var.d;
        boolean z12 = false;
        if (p0Var.f22236f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        p0Var.f22236f = aVar;
        p0Var.h = b3Var;
        TL_iv.PageBlock pageBlock = aVar.f21910b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = p0Var.f22234c;
            if (pageblockdetails.open) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatedArrowDrawable.a(f10);
            SpannableStringBuilder r10 = b6.r(pageblockdetails.title, null, true);
            if (!aVar.f21925s) {
                aVar.f21925s = true;
                if (r10.length() == 0 || (b6.q(0, r10.length(), r10) & 1) != 0) {
                    z12 = true;
                }
                aVar.f21924r = z12;
            }
            e1Var.setAutoBold(aVar.f21924r);
            if (!z11 && String.valueOf(e1Var.getText()).equals(b6.l(pageblockdetails.title))) {
                return;
            }
            e1Var.setTextSilently(r10);
            e1Var.f();
        }
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new p0(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
