package defpackage;

import android.content.Context;
import android.view.View;
public final class zb extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, String str, String str2) {
        c6c K = c6c.K(zb.class);
        K.k = i;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((ac) view).a(c6cVar.k, c6cVar.m, c6cVar.n);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ac(ylbVar, context, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
