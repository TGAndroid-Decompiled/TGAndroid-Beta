package defpackage;

import android.content.Context;
import android.view.View;
public final class ej7 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        fj7 fj7Var = (fj7) view;
        fj7Var.a(c6cVar.d, c6cVar.A, (g6b) c6cVar.H);
        fj7Var.b(c6cVar.e, false);
        boolean z2 = c6cVar.f;
        if (fj7Var.h != z2) {
            fj7Var.h = z2;
            fj7Var.G.a(z2);
            fj7Var.invalidate();
        }
        fj7Var.setOnCheckboxClick(c6cVar.E);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new fj7(context, ylbVar);
    }
}
