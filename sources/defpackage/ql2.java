package defpackage;

import android.content.Context;
import android.view.View;
public final class ql2 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        view.requestLayout();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        rl2 rl2Var = new rl2(context, vnbVar, (byte) 0);
        rl2Var.setIsSingleCell(true);
        rl2Var.setViewType(35);
        return rl2Var;
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.d == b8cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
