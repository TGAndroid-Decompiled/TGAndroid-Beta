package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class wyb implements oac, pac, g94 {
    public final mzb a;

    public wyb(mzb mzbVar) {
        this.a = mzbVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.e();
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        mzb mzbVar = this.a;
        boolean z = false;
        if (!mzbVar.K.k3 && !mzbVar.y.k3) {
            Object obj = c6cVar.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z = mzbVar.l((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        mzb mzbVar = this.a;
        if (mzbVar.n) {
            jac jacVar = mzbVar.j0;
            if (jacVar != null) {
                jacVar.a(Long.valueOf(c6cVar.C), Boolean.FALSE);
            }
        } else if (c6cVar.C == -2) {
            Runnable runnable = mzbVar.i0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            jac jacVar2 = mzbVar.h0;
            if (jacVar2 != null) {
                jacVar2.a(Integer.valueOf(c6cVar.d), Boolean.FALSE);
            }
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
