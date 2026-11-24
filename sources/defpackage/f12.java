package defpackage;

import android.content.Context;
import android.view.View;
public final class f12 extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(CharSequence charSequence, String str) {
        c4c K = c4c.K(f12.class);
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        g12 g12Var = (g12) view;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        g12Var.b.setText(charSequence);
        g12Var.c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new g12(context, wjbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
