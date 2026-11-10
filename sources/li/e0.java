package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class e0 extends w31 {
    public static final int f18533b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) x31Var.G;
        f0Var.f18994a = aVar;
        f0Var.E = (d0) x31Var.H;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        f0 f0Var = new f0(i7, context, h6Var);
        f0Var.setBackground(new y1(m6.w0(m6.f27890d6, h6Var)));
        return f0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
