package defpackage;

import android.content.Context;
import android.view.View;
public final class v34 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        w34 w34Var = (w34) view;
        w34Var.n = (qac) c6cVar.H;
        w34Var.r = c6cVar;
        w34Var.b(c6cVar.A, false);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new w34(context, ylbVar);
    }
}
