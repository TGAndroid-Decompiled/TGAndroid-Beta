package defpackage;

import android.content.Context;
import android.view.View;
public final class uc9 extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(String str) {
        b8c K = b8c.K(uc9.class);
        K.m = str;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((vc9) view).set(b8cVar.m);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new vc9(context, vnbVar);
    }
}
