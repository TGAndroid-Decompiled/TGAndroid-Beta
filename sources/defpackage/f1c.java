package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f1c extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        int i;
        g1c g1cVar = (g1c) view;
        boolean z3 = false;
        if (b8cVar.s) {
            g1cVar.f();
        } else {
            Object obj = b8cVar.H;
            if (obj == null) {
                if (b8cVar.d == -2) {
                    g1cVar.c();
                } else {
                    if ((b8cVar.z & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    g1cVar.d(z2, b8cVar.r, b8cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                boolean z4 = b8cVar.J;
                long j = b8cVar.y;
                if (!z4) {
                    g1cVar.g(j, (TLRPC.TL_forumTopic) obj, b8cVar.e);
                } else {
                    g1cVar.b(j, (TLRPC.TL_forumTopic) obj, b8cVar.e);
                }
            }
        }
        if (vsd.a(b8cVar.z, 8)) {
            i = hl.L(10.0f);
        } else {
            i = 0;
        }
        g1cVar.M = i;
        if (q9cVar != null && q9cVar.k3 && g1cVar.s) {
            z3 = true;
        }
        g1cVar.setReorder(z3);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new g1c(i, vnbVar, context);
    }
}
