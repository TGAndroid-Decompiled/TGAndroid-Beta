package defpackage;

import android.content.Context;
import android.view.View;
public final class x9a extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((y9a) view).set(c6cVar.A);
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.A == c6cVar2.A) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new y9a(context, ylbVar);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.d == c6cVar2.d) {
            return true;
        }
        return false;
    }
}
