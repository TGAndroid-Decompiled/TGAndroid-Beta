package defpackage;

import android.content.Context;
import android.view.View;
public final class k24 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        l24 l24Var = (l24) view;
        l24Var.n = (p8c) c4cVar.H;
        l24Var.r = c4cVar;
        l24Var.b(c4cVar.A, false);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new l24(context, wjbVar);
    }
}
