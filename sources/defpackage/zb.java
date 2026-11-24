package defpackage;

import android.content.Context;
import android.view.View;
public final class zb extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, String str, String str2) {
        c4c K = c4c.K(zb.class);
        K.k = i;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((ac) view).a(c4cVar.k, c4cVar.m, c4cVar.n);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ac(wjbVar, context, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
