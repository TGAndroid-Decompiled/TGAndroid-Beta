package defpackage;

import android.content.Context;
import android.view.View;
public final class jo2 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        long j = b8cVar.C;
        ((ko2) view).a((int) j, (int) (j >>> 32), b8cVar.k, b8cVar.m, b8cVar.o, b8cVar.r);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ko2(vnbVar, context, false);
    }
}
