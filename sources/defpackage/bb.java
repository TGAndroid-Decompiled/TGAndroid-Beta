package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class bb extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(android.view.View r27, defpackage.b8c r28, boolean r29, defpackage.l9c r30, defpackage.q9c r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.b(android.view.View, b8c, boolean, l9c, q9c):void");
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.I == b8cVar2.I && TextUtils.equals(b8cVar.n, b8cVar2.n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new cb(context, vnbVar);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.I == b8cVar2.I && TextUtils.isEmpty(b8cVar.n) == TextUtils.isEmpty(b8cVar2.n)) {
            return true;
        }
        return false;
    }
}
