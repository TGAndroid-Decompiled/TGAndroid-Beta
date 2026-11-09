package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class u0 extends x31 {
    public static final int f18915b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) y31Var.G;
        v0Var.f18989a = aVar;
        v0Var.f18930w = (q2) y31Var.H;
        v0Var.f18931x = id.f23157a0;
        v0Var.c(aVar);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new v0(context, g6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
