package defpackage;

import android.content.Context;
import android.view.View;
public final class cg1 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        dg1 dg1Var = (dg1) view;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        dg1Var.setText(charSequence);
        dg1Var.r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new dg1(context, wjbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
