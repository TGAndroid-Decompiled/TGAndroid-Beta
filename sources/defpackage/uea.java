package defpackage;

import android.content.Context;
import android.view.View;
public final class uea extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    public static b8c i(eo6 eo6Var, qcc qccVar) {
        b8c K = b8c.K(uea.class);
        K.H = eo6Var;
        K.I = qccVar;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        vea veaVar = (vea) view;
        Object obj = b8cVar.H;
        if (obj instanceof r47) {
            veaVar.f((r47) obj, z);
        } else if (obj instanceof eo6) {
            eo6 eo6Var = (eo6) obj;
            veaVar.setTag(eo6Var);
            veaVar.f(eo6Var.e, z);
        }
        Object obj2 = b8cVar.I;
        if (obj2 instanceof qcc) {
            veaVar.setNeedPlayMessageListener((qcc) obj2);
        }
        veaVar.e(b8cVar.e, false);
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.d == b8cVar2.d && b8cVar.H == b8cVar2.H) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        vea veaVar = new vea(0, vnbVar, context);
        veaVar.setCheckForButtonPress(true);
        return veaVar;
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.d == b8cVar2.d && b8cVar.H == b8cVar2.H) {
            return true;
        }
        return false;
    }
}
