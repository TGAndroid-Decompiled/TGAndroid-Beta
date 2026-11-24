package defpackage;

import android.content.Context;
import android.view.View;
public final class r1b extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void a(r59 r59Var, View view, c6c c6cVar) {
        boolean z;
        s1b s1bVar = (s1b) view;
        boolean z2 = false;
        if (c6cVar != null && c6cVar.e) {
            z = true;
        } else {
            z = false;
        }
        s1bVar.b(z, true);
        if ((r59Var instanceof q7c) && ((q7c) r59Var).k3) {
            z2 = true;
        }
        s1bVar.c(z2);
    }

    @Override
    public final void b(android.view.View r4, defpackage.c6c r5, boolean r6, defpackage.l7c r7, defpackage.q7c r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1b.b(android.view.View, c6c, boolean, l7c, q7c):void");
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        s1b s1bVar = new s1b(context, 1);
        if (r59Var instanceof q7c) {
            s1bVar.setOnReorderButtonTouchListener(new f8((q7c) r59Var, s1bVar, (byte) 7));
        }
        return s1bVar;
    }
}
