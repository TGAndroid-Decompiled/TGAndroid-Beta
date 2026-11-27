package defpackage;

import android.content.Context;
import android.view.View;
public final class g96 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((h96) view).set((m96) b8cVar.H);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        h96 h96Var = new h96(i, context, false);
        h96Var.setLayoutParams(new r79(-2, -2));
        return h96Var;
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.H == b8cVar2.H) {
            return true;
        }
        return false;
    }
}
