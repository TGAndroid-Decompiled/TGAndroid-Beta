package defpackage;

import android.content.Context;
import android.view.View;
public final class ce9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((de9) view).c = (ll0) c6cVar.H;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new de9(context, ylbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
