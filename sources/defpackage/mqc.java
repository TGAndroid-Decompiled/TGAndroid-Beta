package defpackage;

import android.content.Context;
import android.view.View;
public final class mqc extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((nqc) view).a(b8cVar.k, b8cVar.m, b8cVar.n);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new nqc(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }
}
