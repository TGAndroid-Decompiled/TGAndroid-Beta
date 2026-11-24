package defpackage;

import android.content.Context;
import android.view.View;
public final class bp2 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        long j = c6cVar.C;
        ((cp2) view).a((int) j, (int) (j >>> 32), c6cVar.k, c6cVar.m, c6cVar.o, c6cVar.r);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new cp2(ylbVar, context, false);
    }
}
