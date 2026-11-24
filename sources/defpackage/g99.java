package defpackage;

import android.content.Context;
import android.view.View;
public final class g99 extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(String str) {
        c4c K = c4c.K(g99.class);
        K.m = str;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((h99) view).set(c4cVar.m);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new h99(context, wjbVar);
    }
}
