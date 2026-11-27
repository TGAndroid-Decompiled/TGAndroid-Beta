package defpackage;

import android.content.Context;
import android.view.View;
public final class p3b extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void a(d79 d79Var, View view, b8c b8cVar) {
        boolean z;
        q3b q3bVar = (q3b) view;
        boolean z2 = false;
        if (b8cVar != null && b8cVar.e) {
            z = true;
        } else {
            z = false;
        }
        q3bVar.b(z, true);
        if ((d79Var instanceof q9c) && ((q9c) d79Var).k3) {
            z2 = true;
        }
        q3bVar.c(z2);
    }

    @Override
    public final void b(android.view.View r4, defpackage.b8c r5, boolean r6, defpackage.l9c r7, defpackage.q9c r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3b.b(android.view.View, b8c, boolean, l9c, q9c):void");
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        q3b q3bVar = new q3b(context, 1);
        if (d79Var instanceof q9c) {
            q3bVar.setOnReorderButtonTouchListener(new g8((q9c) d79Var, q3bVar, (byte) 7));
        }
        return q3bVar;
    }
}
