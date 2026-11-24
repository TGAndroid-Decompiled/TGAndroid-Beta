package defpackage;

import android.content.Context;
import android.view.View;
public final class qza extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void a(o39 o39Var, View view, c4c c4cVar) {
        boolean z;
        rza rzaVar = (rza) view;
        boolean z2 = false;
        if (c4cVar != null && c4cVar.e) {
            z = true;
        } else {
            z = false;
        }
        rzaVar.b(z, true);
        if ((o39Var instanceof q5c) && ((q5c) o39Var).k3) {
            z2 = true;
        }
        rzaVar.c(z2);
    }

    @Override
    public final void b(android.view.View r4, defpackage.c4c r5, boolean r6, defpackage.l5c r7, defpackage.q5c r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qza.b(android.view.View, c4c, boolean, l5c, q5c):void");
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        rza rzaVar = new rza(context, 1);
        if (o39Var instanceof q5c) {
            rzaVar.setOnReorderButtonTouchListener(new f8((q5c) o39Var, rzaVar, (byte) 7));
        }
        return rzaVar;
    }
}
