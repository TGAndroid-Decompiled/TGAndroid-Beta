package defpackage;

import android.content.Context;
import android.view.View;
public final class maa extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        Object obj = c6cVar.H;
        if (obj instanceof tq8) {
            tq8 tq8Var = (tq8) obj;
            ((oaa) view).b(c6cVar.m, tq8Var.d, tq8Var.e, z);
        } else if (obj instanceof bc7) {
            ((oaa) view).a(c6cVar.m, ((bc7) obj).b, true, z);
        }
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new oaa(context);
    }
}
