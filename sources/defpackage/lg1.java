package defpackage;

import android.content.Context;
import android.view.View;
public final class lg1 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        mg1 mg1Var = (mg1) view;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        mg1Var.setText(charSequence);
        mg1Var.r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new mg1(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
