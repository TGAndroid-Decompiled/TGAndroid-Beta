package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class zb9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        float f;
        ac9 ac9Var = (ac9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        he9 he9Var = (he9) c4cVar.I;
        mc9 mc9Var = ac9Var.d;
        boolean z3 = false;
        if (ac9Var.f != lk0Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        ac9Var.f = lk0Var;
        ac9Var.h = he9Var;
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = ac9Var.c;
            if (pageblockdetails.open) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            animatedArrowDrawable.a(f);
            SpannableStringBuilder r = yi9.r(pageblockdetails.title, null, true);
            if (!lk0Var.s) {
                lk0Var.s = true;
                if (r.length() == 0 || (yi9.q(0, r.length(), r) & 1) != 0) {
                    z3 = true;
                }
                lk0Var.r = z3;
            }
            mc9Var.setAutoBold(lk0Var.r);
            if (!z2 && String.valueOf(mc9Var.getText()).equals(yi9.l(pageblockdetails.title))) {
                return;
            }
            mc9Var.setTextSilently(r);
            mc9Var.f();
        }
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ac9(context, wjbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
