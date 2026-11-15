package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class s0 extends a41 {
    public static final int f21989b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        t0 t0Var = (t0) view;
        a aVar = (a) b41Var.G;
        t0Var.f22106a = aVar;
        t0Var.f22003w = (o2) b41Var.H;
        t0Var.f22004x = hd.f24104a0;
        t0Var.c(aVar);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new t0(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
