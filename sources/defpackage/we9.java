package defpackage;

import android.content.Context;
import android.view.View;
public final class we9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((xe9) view).h((mk0) b8cVar.H, (ji9) b8cVar.I);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        xe9 xe9Var = new xe9(i, vnbVar, context);
        xe9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        return xe9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
