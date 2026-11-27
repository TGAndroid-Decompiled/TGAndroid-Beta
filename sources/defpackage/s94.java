package defpackage;

import android.content.Context;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
public final class s94 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        t94 t94Var;
        v94 v94Var = (v94) view;
        v94Var.P = z;
        if (q9cVar instanceof t94) {
            t94Var = (t94) q9cVar;
        } else {
            t94Var = null;
        }
        v94Var.setHost(t94Var);
        v94Var.o(false, 0.0f);
        v94Var.setScrimHidden(false);
        v94Var.m((r47) b8cVar.H, (ArrayList) b8cVar.I);
        v94Var.invalidate();
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.H == b8cVar2.H && Objects.equals(b8cVar.I, b8cVar2.I) && b8cVar.j == b8cVar2.j) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new v94(i, vnbVar, context);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.d == b8cVar2.d && b8cVar.C == b8cVar2.C) {
            return true;
        }
        return false;
    }
}
