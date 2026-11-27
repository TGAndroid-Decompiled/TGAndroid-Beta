package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class n59 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        z57 z57Var = (z57) view;
        z57Var.a((TLObject) b8cVar.H, b8cVar.A, true);
        z57Var.setOnClickListener(b8cVar.E);
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.C == b8cVar2.C) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        z57 z57Var = new z57(context);
        z57Var.setBackground(aob.L0(false));
        return z57Var;
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.C == b8cVar2.C) {
            return true;
        }
        return false;
    }
}
