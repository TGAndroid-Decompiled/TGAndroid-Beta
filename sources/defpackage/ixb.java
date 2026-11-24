package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ixb extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        jxb jxbVar = (jxb) view;
        boolean z3 = false;
        if (c4cVar.s) {
            jxbVar.e();
        } else {
            Object obj = c4cVar.H;
            if (obj == null) {
                if (c4cVar.C == -2) {
                    jxbVar.b(c4cVar.r, c4cVar.e);
                } else {
                    if ((c4cVar.z & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jxbVar.c(z2, c4cVar.r, c4cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!c4cVar.J) {
                    jxbVar.f((TLRPC.TL_forumTopic) obj, c4cVar.e);
                } else {
                    jxbVar.a(c4cVar.y, (TLRPC.TL_forumTopic) obj, c4cVar.e);
                }
            }
        }
        if (q5cVar != null && q5cVar.k3 && jxbVar.F) {
            z3 = true;
        }
        jxbVar.setReorder(z3);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new jxb(i, wjbVar, context);
    }
}
