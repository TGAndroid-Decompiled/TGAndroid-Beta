package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class ol9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        TL_iv.RichText richText;
        pl9 pl9Var = (pl9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        nl9 nl9Var = (nl9) b8cVar.I;
        dg9 dg9Var = pl9Var.r;
        pl9Var.a = mk0Var;
        pl9Var.s = nl9Var;
        pl9Var.f(hl.L(16.0f), hl.L(1.0f), hl.L(16.0f), hl.L(8.0f));
        pl9Var.c(mk0Var);
        if (nl9Var != null) {
            richText = (TL_iv.RichText) ((wh9) nl9Var).a.u3.get(Long.valueOf(mk0Var.t));
        } else {
            richText = null;
        }
        if (!String.valueOf(dg9Var.getText()).equals(mm9.l(richText))) {
            dg9Var.setTextSilently(pv3.m(mm9.r(richText, null, true), dg9Var.getPaint().getFontMetricsInt(), false, null, 0));
            dg9Var.f();
        }
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new pl9(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
