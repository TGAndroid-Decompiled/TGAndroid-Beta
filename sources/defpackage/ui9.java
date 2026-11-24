package defpackage;

import android.content.Context;
import android.view.View;
public final class ui9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((wi9) view).d((lk0) c4cVar.H, (ti9) c4cVar.I, c4cVar.s);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        wi9 wi9Var = new wi9(context, wjbVar);
        wi9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return wi9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
