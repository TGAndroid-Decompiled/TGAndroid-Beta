package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class ae9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        float f;
        be9 be9Var = (be9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        lg9 lg9Var = (lg9) c6cVar.I;
        ne9 ne9Var = be9Var.d;
        boolean z3 = false;
        if (be9Var.f != ll0Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        be9Var.f = ll0Var;
        be9Var.h = lg9Var;
        TL_iv.PageBlock pageBlock = ll0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            AnimatedArrowDrawable animatedArrowDrawable = be9Var.c;
            if (pageblockdetails.open) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            animatedArrowDrawable.a(f);
            SpannableStringBuilder r = zk9.r(pageblockdetails.title, null, true);
            if (!ll0Var.s) {
                ll0Var.s = true;
                if (r.length() == 0 || (zk9.q(0, r.length(), r) & 1) != 0) {
                    z3 = true;
                }
                ll0Var.r = z3;
            }
            ne9Var.setAutoBold(ll0Var.r);
            if (!z2 && String.valueOf(ne9Var.getText()).equals(zk9.l(pageblockdetails.title))) {
                return;
            }
            ne9Var.setTextSilently(r);
            ne9Var.f();
        }
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new be9(context, ylbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
