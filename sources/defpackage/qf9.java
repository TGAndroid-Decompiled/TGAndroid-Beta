package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class qf9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        float f;
        rf9 rf9Var = (rf9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        yh9 yh9Var = (yh9) b8cVar.I;
        dg9 dg9Var = rf9Var.d;
        boolean z3 = false;
        if (rf9Var.f != mk0Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        rf9Var.f = mk0Var;
        rf9Var.h = yh9Var;
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = rf9Var.c;
            if (pageblockdetails.open) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            animatedArrowDrawable.a(f);
            SpannableStringBuilder r = mm9.r(pageblockdetails.title, null, true);
            if (!mk0Var.s) {
                mk0Var.s = true;
                if (r.length() == 0 || (mm9.q(0, r.length(), r) & 1) != 0) {
                    z3 = true;
                }
                mk0Var.r = z3;
            }
            dg9Var.setAutoBold(mk0Var.r);
            if (!z2 && String.valueOf(dg9Var.getText()).equals(mm9.l(pageblockdetails.title))) {
                return;
            }
            dg9Var.setTextSilently(r);
            dg9Var.f();
        }
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new rf9(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
