package defpackage;

import android.content.Context;
import android.view.View;
public final class gb9 extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(String str) {
        c6c K = c6c.K(gb9.class);
        K.m = str;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((hb9) view).set(c6cVar.m);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new hb9(context, ylbVar);
    }
}
