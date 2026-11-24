package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
public final class y19 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        s37 s37Var = (s37) view;
        s37Var.a((TLObject) c4cVar.H, c4cVar.A, true);
        s37Var.setOnClickListener(c4cVar.E);
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.C == c4cVar2.C) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        s37 s37Var = new s37(context);
        s37Var.setBackground(bkb.L0(false));
        return s37Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.C == c4cVar2.C) {
            return true;
        }
        return false;
    }
}
