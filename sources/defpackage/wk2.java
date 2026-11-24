package defpackage;

import android.content.Context;
import android.view.View;
public final class wk2 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        view.requestLayout();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        xk2 xk2Var = new xk2(context, wjbVar, (byte) 0);
        xk2Var.setIsSingleCell(true);
        xk2Var.setViewType(35);
        return xk2Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
