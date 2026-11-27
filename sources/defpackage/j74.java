package defpackage;

import android.content.Context;
import android.view.View;
public final class j74 extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(String str, CharSequence charSequence, int i) {
        b8c K = b8c.K(j74.class);
        K.b = false;
        K.A = i;
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((k74) view).a(b8cVar.A, b8cVar.m, b8cVar.n);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new k74(0, vnbVar, context);
    }
}
