package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class twb implements n8c, o8c, x74 {
    public final kxb a;

    public twb(kxb kxbVar) {
        this.a = kxbVar;
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        kxb kxbVar = this.a;
        boolean z = false;
        if (!kxbVar.K.k3 && !kxbVar.y.k3) {
            Object obj = c4cVar.H;
            if (obj instanceof TLRPC.TL_forumTopic) {
                z = kxbVar.l((TLRPC.TL_forumTopic) obj, view, false);
            }
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        kxb kxbVar = this.a;
        if (kxbVar.n) {
            i8c i8cVar = kxbVar.j0;
            if (i8cVar != null) {
                i8cVar.a(Long.valueOf(c4cVar.C), Boolean.FALSE);
            }
        } else if (c4cVar.C == -2) {
            Runnable runnable = kxbVar.i0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            i8c i8cVar2 = kxbVar.h0;
            if (i8cVar2 != null) {
                i8cVar2.a(Integer.valueOf(c4cVar.d), Boolean.FALSE);
            }
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.a.e();
    }

    @Override
    public final void D(float f, int i) {
    }
}
