package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class exb extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        int i;
        fxb fxbVar = (fxb) view;
        boolean z3 = false;
        if (c4cVar.s) {
            fxbVar.f();
        } else {
            Object obj = c4cVar.H;
            if (obj == null) {
                if (c4cVar.d == -2) {
                    fxbVar.c();
                } else {
                    if ((c4cVar.z & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fxbVar.d(z2, c4cVar.r, c4cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                boolean z4 = c4cVar.J;
                long j = c4cVar.y;
                if (!z4) {
                    fxbVar.g(j, (TLRPC.TL_forumTopic) obj, c4cVar.e);
                } else {
                    fxbVar.b(j, (TLRPC.TL_forumTopic) obj, c4cVar.e);
                }
            }
        }
        if (fod.a(c4cVar.z, 8)) {
            i = gl.L(10.0f);
        } else {
            i = 0;
        }
        fxbVar.M = i;
        if (q5cVar != null && q5cVar.k3 && fxbVar.s) {
            z3 = true;
        }
        fxbVar.setReorder(z3);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new fxb(i, wjbVar, context);
    }
}
