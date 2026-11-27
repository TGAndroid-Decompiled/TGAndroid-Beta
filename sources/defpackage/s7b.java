package defpackage;

import android.content.Context;
import android.view.View;
public final class s7b extends a8c {
    public static final int c = 0;
    public gd4 b;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void a(d79 d79Var, View view, b8c b8cVar) {
        boolean z;
        jja jjaVar = (jja) view;
        if (b8cVar != null && b8cVar.h) {
            z = true;
        } else {
            z = false;
        }
        jjaVar.l(z, false);
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        jja jjaVar = (jja) view;
        jjaVar.k(b8cVar.w, (r47) b8cVar.H, false);
        jjaVar.i(b8cVar.e, false);
        jjaVar.l(b8cVar.h, false);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        if (this.b == null) {
            this.b = new gd4(context, vnbVar);
        }
        jja jjaVar = new jja(context, this.b, i);
        jjaVar.x0 = true;
        jjaVar.e0 = true;
        return jjaVar;
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.r == b8cVar2.r && b8cVar.e == b8cVar2.e && b8cVar.C == b8cVar2.C) {
            return true;
        }
        return false;
    }
}
