package defpackage;

import android.content.Context;
import android.view.View;
public final class bh7 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ch7 ch7Var = (ch7) view;
        ch7Var.a(c4cVar.d, c4cVar.A, (f4b) c4cVar.H);
        ch7Var.b(c4cVar.e, false);
        boolean z2 = c4cVar.f;
        if (ch7Var.h != z2) {
            ch7Var.h = z2;
            ch7Var.G.a(z2);
            ch7Var.invalidate();
        }
        ch7Var.setOnCheckboxClick(c4cVar.E);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ch7(context, wjbVar);
    }
}
