package defpackage;

import android.content.Context;
import android.view.View;
public final class k96 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((l96) view).set((n96) b8cVar.H);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new l96(context);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.H == b8cVar2.H) {
            return true;
        }
        return false;
    }
}
