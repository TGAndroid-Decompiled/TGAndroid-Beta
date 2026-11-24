package defpackage;

import android.content.Context;
import android.view.View;
public final class g96 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((h96) view).set((j96) c6cVar.H);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new h96(context);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.H == c6cVar2.H) {
            return true;
        }
        return false;
    }
}
