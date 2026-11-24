package defpackage;

import android.content.Context;
import android.view.View;
public final class g76 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((h76) view).set((j76) c4cVar.H);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new h76(context);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.H == c4cVar2.H) {
            return true;
        }
        return false;
    }
}
