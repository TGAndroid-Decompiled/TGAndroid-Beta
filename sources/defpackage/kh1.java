package defpackage;

import android.content.Context;
import android.view.View;
public final class kh1 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        lh1 lh1Var = (lh1) view;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        lh1Var.setText(charSequence);
        lh1Var.r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new lh1(context, ylbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
