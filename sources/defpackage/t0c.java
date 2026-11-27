package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class t0c implements s84, ncc, occ {
    public final l1c a;

    public t0c(l1c l1cVar) {
        this.a = l1cVar;
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        l1c l1cVar = this.a;
        boolean z = false;
        if (!l1cVar.K.k3 && !l1cVar.y.k3) {
            Object obj = b8cVar.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z = l1cVar.l((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        l1c l1cVar = this.a;
        if (l1cVar.n) {
            icc iccVar = l1cVar.j0;
            if (iccVar != null) {
                iccVar.a(Long.valueOf(b8cVar.C), Boolean.FALSE);
            }
        } else if (b8cVar.C == -2) {
            Runnable runnable = l1cVar.i0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            icc iccVar2 = l1cVar.h0;
            if (iccVar2 != null) {
                iccVar2.a(Integer.valueOf(b8cVar.d), Boolean.FALSE);
            }
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.a.e();
    }

    @Override
    public final void v0(float f, int i) {
    }
}
