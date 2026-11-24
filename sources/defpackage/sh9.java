package defpackage;

import android.content.Context;
import android.view.View;
public final class sh9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((th9) view).g((ll0) c6cVar.H, (rh9) c6cVar.I);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new th9(i, ylbVar, context);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
