package defpackage;

import android.content.Context;
import android.view.View;
public final class uu4 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i;
        kz9 kz9Var = (kz9) view;
        fm2 fm2Var = c4cVar.l;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        kz9Var.x.setVisibility(8);
        kz9Var.I = null;
        kz9Var.J = null;
        be0 be0Var = kz9Var.c;
        be0Var.setRoundRadius(gl.L(20.0f));
        be0Var.setImageDrawable(fm2Var);
        df0 df0Var = kz9Var.d;
        df0Var.k(charSequence);
        boolean[] zArr = kz9Var.s;
        zArr[0] = false;
        kz9Var.setSubtitle(charSequence2);
        jia jiaVar = kz9Var.e;
        if (zArr[0]) {
            i = bkb.m5;
        } else {
            i = bkb.q5;
        }
        zkb.W(jiaVar, i, kz9Var.a);
        wf2 wf2Var = kz9Var.w;
        if (wf2Var != null) {
            wf2Var.setAlpha(1.0f);
        }
        df0Var.i(null);
        kz9Var.setDivider(z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        kz9 kz9Var = new kz9(context, false, false, wjbVar, false);
        kz9Var.setCellBackgroundVisible(false);
        return kz9Var;
    }
}
