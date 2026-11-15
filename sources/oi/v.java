package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class v extends a41 {
    public static final int f22037b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((w) view).h((a) b41Var.G, (k3) b41Var.H);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        w wVar = new w(i7, context, e6Var);
        wVar.setBackground(new w1(j6.w0(j6.f28849d6, e6Var)));
        return wVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
