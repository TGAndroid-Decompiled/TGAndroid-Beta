package defpackage;

import android.content.Context;
import android.view.View;
public final class hs0 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        is0 is0Var = (is0) view;
        u2c u2cVar = (u2c) c6cVar.H;
        is0Var.a.setText(u2cVar.b);
        is0Var.b.setText(u2cVar.c);
        if (is0Var.c != z) {
            is0Var.invalidate();
        }
        is0Var.c = z;
        is0Var.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new is0(context);
    }
}
