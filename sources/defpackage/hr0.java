package defpackage;

import android.content.Context;
import android.view.View;
public final class hr0 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ir0 ir0Var = (ir0) view;
        t4c t4cVar = (t4c) b8cVar.H;
        ir0Var.a.setText(t4cVar.b);
        ir0Var.b.setText(t4cVar.c);
        if (ir0Var.c != z) {
            ir0Var.invalidate();
        }
        ir0Var.c = z;
        ir0Var.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ir0(context);
    }
}
