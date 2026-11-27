package defpackage;

import android.content.Context;
import android.view.View;
public final class oba extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((pba) view).set(b8cVar.A);
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.A == b8cVar2.A) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new pba(context, vnbVar);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.d == b8cVar2.d) {
            return true;
        }
        return false;
    }
}
