package defpackage;

import android.content.Context;
import android.view.View;
public final class im9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((km9) view).d((mk0) b8cVar.H, (hm9) b8cVar.I, b8cVar.s);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        km9 km9Var = new km9(context, vnbVar);
        km9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        return km9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
