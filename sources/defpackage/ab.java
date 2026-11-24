package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class ab extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(android.view.View r27, defpackage.c4c r28, boolean r29, defpackage.l5c r30, defpackage.q5c r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab.b(android.view.View, c4c, boolean, l5c, q5c):void");
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.I == c4cVar2.I && TextUtils.equals(c4cVar.n, c4cVar2.n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new bb(context, wjbVar);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.I == c4cVar2.I && TextUtils.isEmpty(c4cVar.n) == TextUtils.isEmpty(c4cVar2.n)) {
            return true;
        }
        return false;
    }
}
