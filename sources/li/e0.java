package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class e0 extends w31 {
    public static final int f18527b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) x31Var.G;
        f0Var.f18986a = aVar;
        f0Var.E = (d0) x31Var.H;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        f0 f0Var = new f0(i7, context, f6Var);
        f0Var.setBackground(new y1(k6.w0(k6.f27849d6, f6Var)));
        return f0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
