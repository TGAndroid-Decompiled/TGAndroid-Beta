package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class gzb extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        int i;
        hzb hzbVar = (hzb) view;
        boolean z3 = false;
        if (c6cVar.s) {
            hzbVar.f();
        } else {
            Object obj = c6cVar.H;
            if (obj == null) {
                if (c6cVar.d == -2) {
                    hzbVar.c();
                } else {
                    if ((c6cVar.z & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hzbVar.d(z2, c6cVar.r, c6cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                boolean z4 = c6cVar.J;
                long j = c6cVar.y;
                if (!z4) {
                    hzbVar.g(j, (TLRPC.TL_forumTopic) obj, c6cVar.e);
                } else {
                    hzbVar.b(j, (TLRPC.TL_forumTopic) obj, c6cVar.e);
                }
            }
        }
        if (iqd.a(c6cVar.z, 8)) {
            i = gm.L(10.0f);
        } else {
            i = 0;
        }
        hzbVar.M = i;
        if (q7cVar != null && q7cVar.k3 && hzbVar.s) {
            z3 = true;
        }
        hzbVar.setReorder(z3);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new hzb(i, ylbVar, context);
    }
}
