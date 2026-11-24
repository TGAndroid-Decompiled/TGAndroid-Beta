package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kzb extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        lzb lzbVar = (lzb) view;
        boolean z3 = false;
        if (c6cVar.s) {
            lzbVar.e();
        } else {
            Object obj = c6cVar.H;
            if (obj == null) {
                if (c6cVar.C == -2) {
                    lzbVar.b(c6cVar.r, c6cVar.e);
                } else {
                    if ((c6cVar.z & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    lzbVar.c(z2, c6cVar.r, c6cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!c6cVar.J) {
                    lzbVar.f((TLRPC.TL_forumTopic) obj, c6cVar.e);
                } else {
                    lzbVar.a(c6cVar.y, (TLRPC.TL_forumTopic) obj, c6cVar.e);
                }
            }
        }
        if (q7cVar != null && q7cVar.k3 && lzbVar.F) {
            z3 = true;
        }
        lzbVar.setReorder(z3);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new lzb(i, ylbVar, context);
    }
}
