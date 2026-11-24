package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wx2 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        bz9 bz9Var = (bz9) view;
        bz9Var.w = (TLRPC.TL_help_country) c4cVar.H;
        bz9Var.f();
        bz9Var.setDivider(z);
        bz9Var.c(c4cVar.e, false);
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.I(c4cVar2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        bz9 bz9Var = new bz9(context, wjbVar);
        bz9Var.setBackground(null);
        return bz9Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.J(c4cVar2);
    }
}
