package defpackage;

import android.content.Context;
import android.view.View;
public final class hr0 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ir0 ir0Var = (ir0) view;
        u0c u0cVar = (u0c) c4cVar.H;
        ir0Var.a.setText(u0cVar.b);
        ir0Var.b.setText(u0cVar.c);
        if (ir0Var.c != z) {
            ir0Var.invalidate();
        }
        ir0Var.c = z;
        ir0Var.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ir0(context);
    }
}
