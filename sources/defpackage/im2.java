package defpackage;

import android.content.Context;
import android.view.View;
public final class im2 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        view.requestLayout();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        jm2 jm2Var = new jm2(context, ylbVar, (byte) 0);
        jm2Var.setIsSingleCell(true);
        jm2Var.setViewType(35);
        return jm2Var;
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.d == c6cVar2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
