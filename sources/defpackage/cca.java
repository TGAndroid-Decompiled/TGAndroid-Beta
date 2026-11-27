package defpackage;

import android.content.Context;
import android.view.View;
public final class cca extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof es8) {
            es8 es8Var = (es8) obj;
            ((eca) view).b(b8cVar.m, es8Var.d, es8Var.e, z);
        } else if (obj instanceof hc7) {
            ((eca) view).a(b8cVar.m, ((hc7) obj).b, true, z);
        }
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new eca(context);
    }
}
