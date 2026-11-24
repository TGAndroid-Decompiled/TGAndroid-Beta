package defpackage;

import android.content.Context;
import android.view.View;
public final class v3b extends b4c {
    public static final int c = 0;
    public jb4 b;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void a(o39 o39Var, View view, c4c c4cVar) {
        boolean z;
        qfa qfaVar = (qfa) view;
        if (c4cVar != null && c4cVar.h) {
            z = true;
        } else {
            z = false;
        }
        qfaVar.l(z, false);
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        qfa qfaVar = (qfa) view;
        qfaVar.k((k27) c4cVar.H, c4cVar.w, false);
        qfaVar.i(c4cVar.e, false);
        qfaVar.l(c4cVar.h, false);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        if (this.b == null) {
            this.b = new jb4(context, wjbVar);
        }
        qfa qfaVar = new qfa(context, this.b, i);
        qfaVar.x0 = true;
        qfaVar.e0 = true;
        return qfaVar;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.r == c4cVar2.r && c4cVar.e == c4cVar2.e && c4cVar.C == c4cVar2.C) {
            return true;
        }
        return false;
    }
}
