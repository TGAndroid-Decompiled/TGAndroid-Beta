package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class ab extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(android.view.View r27, defpackage.c6c r28, boolean r29, defpackage.l7c r30, defpackage.q7c r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab.b(android.view.View, c6c, boolean, l7c, q7c):void");
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.I == c6cVar2.I && TextUtils.equals(c6cVar.n, c6cVar2.n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new bb(context, ylbVar);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.I == c6cVar2.I && TextUtils.isEmpty(c6cVar.n) == TextUtils.isEmpty(c6cVar2.n)) {
            return true;
        }
        return false;
    }
}
