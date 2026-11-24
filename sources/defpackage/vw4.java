package defpackage;

import android.content.Context;
import android.view.View;
public final class vw4 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i;
        m1a m1aVar = (m1a) view;
        sn2 sn2Var = c6cVar.l;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        m1aVar.x.setVisibility(8);
        m1aVar.I = null;
        m1aVar.J = null;
        bf0 bf0Var = m1aVar.c;
        bf0Var.setRoundRadius(gm.L(20.0f));
        bf0Var.setImageDrawable(sn2Var);
        dg0 dg0Var = m1aVar.d;
        dg0Var.k(charSequence);
        boolean[] zArr = m1aVar.s;
        zArr[0] = false;
        m1aVar.setSubtitle(charSequence2);
        lka lkaVar = m1aVar.e;
        if (zArr[0]) {
            i = cmb.m5;
        } else {
            i = cmb.q5;
        }
        anb.W(lkaVar, i, m1aVar.a);
        jh2 jh2Var = m1aVar.w;
        if (jh2Var != null) {
            jh2Var.setAlpha(1.0f);
        }
        dg0Var.i(null);
        m1aVar.setDivider(z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        m1a m1aVar = new m1a(context, false, false, ylbVar, false);
        m1aVar.setCellBackgroundVisible(false);
        return m1aVar;
    }
}
