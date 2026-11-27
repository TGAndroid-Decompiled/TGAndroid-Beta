package defpackage;

import android.content.Context;
import android.view.View;
public final class sf9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((tf9) view).c = (mk0) b8cVar.H;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new tf9(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
