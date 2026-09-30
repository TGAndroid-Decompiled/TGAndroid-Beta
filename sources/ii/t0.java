package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class t0 extends x51 {
    public static final int f11636a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        float f7;
        u0 u0Var = (u0) view;
        a aVar = (a) y51Var.G;
        e3 e3Var = (e3) y51Var.H;
        i1 i1Var = u0Var.d;
        boolean z12 = false;
        if (u0Var.f11661f != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.f11661f = aVar;
        u0Var.h = e3Var;
        TL_iv.PageBlock pageBlock = aVar.f11205b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = u0Var.f11660c;
            if (pageblockdetails.open) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            animatedArrowDrawable.a(f7);
            SpannableStringBuilder r10 = g6.r(pageblockdetails.title, null, true);
            if (!aVar.f11219s) {
                aVar.f11219s = true;
                aVar.f11218r = (r10.length() == 0 || (g6.q(0, r10.length(), r10) & 1) != 0) ? true : true;
            }
            i1Var.setAutoBold(aVar.f11218r);
            if (!z11 && String.valueOf(i1Var.getText()).equals(g6.l(pageblockdetails.title))) {
                return;
            }
            i1Var.setTextSilently(r10);
            i1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
