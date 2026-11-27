package defpackage;

import android.content.Context;
import android.view.View;
public final class yw4 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i;
        e3a e3aVar = (e3a) view;
        zm2 zm2Var = b8cVar.l;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        e3aVar.x.setVisibility(8);
        e3aVar.I = null;
        e3aVar.J = null;
        de0 de0Var = e3aVar.c;
        de0Var.setRoundRadius(hl.L(20.0f));
        de0Var.setImageDrawable(zm2Var);
        ff0 ff0Var = e3aVar.d;
        ff0Var.k(charSequence);
        boolean[] zArr = e3aVar.s;
        zArr[0] = false;
        e3aVar.setSubtitle(charSequence2);
        ema emaVar = e3aVar.e;
        if (zArr[0]) {
            i = aob.n5;
        } else {
            i = aob.r5;
        }
        yob.W(emaVar, i, e3aVar.a);
        og2 og2Var = e3aVar.w;
        if (og2Var != null) {
            og2Var.setAlpha(1.0f);
        }
        ff0Var.i(null);
        e3aVar.setDivider(z);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        e3a e3aVar = new e3a(context, false, false, vnbVar, false);
        e3aVar.setCellBackgroundVisible(false);
        return e3aVar;
    }
}
