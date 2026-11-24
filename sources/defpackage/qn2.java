package defpackage;

import android.content.Context;
import android.view.View;
public final class qn2 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        long j = c4cVar.C;
        ((rn2) view).a((int) j, (int) (j >>> 32), c4cVar.k, c4cVar.m, c4cVar.o, c4cVar.r);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new rn2(wjbVar, context, false);
    }
}
