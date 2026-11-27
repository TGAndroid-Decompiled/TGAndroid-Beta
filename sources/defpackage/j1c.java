package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j1c extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        k1c k1cVar = (k1c) view;
        boolean z3 = false;
        if (b8cVar.s) {
            k1cVar.e();
        } else {
            Object obj = b8cVar.H;
            if (obj == null) {
                if (b8cVar.C == -2) {
                    k1cVar.b(b8cVar.r, b8cVar.e);
                } else {
                    if ((b8cVar.z & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    k1cVar.c(z2, b8cVar.r, b8cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (!b8cVar.J) {
                    k1cVar.f((TLRPC.TL_forumTopic) obj, b8cVar.e);
                } else {
                    k1cVar.a(b8cVar.y, (TLRPC.TL_forumTopic) obj, b8cVar.e);
                }
            }
        }
        if (q9cVar != null && q9cVar.k3 && k1cVar.F) {
            z3 = true;
        }
        k1cVar.setReorder(z3);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new k1c(i, vnbVar, context);
    }
}
