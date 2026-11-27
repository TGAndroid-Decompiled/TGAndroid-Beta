package defpackage;

import android.content.Context;
import android.view.View;
public final class lj7 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        mj7 mj7Var = (mj7) view;
        mj7Var.a(b8cVar.d, b8cVar.A, (c8b) b8cVar.H);
        mj7Var.b(b8cVar.e, false);
        boolean z2 = b8cVar.f;
        if (mj7Var.h != z2) {
            mj7Var.h = z2;
            mj7Var.G.a(z2);
            mj7Var.invalidate();
        }
        mj7Var.setOnCheckboxClick(b8cVar.E);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new mj7(context, vnbVar);
    }
}
