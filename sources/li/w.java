package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class w extends q31 {
    public static final int f18946b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((x) view).h((a) r31Var.G, (n3) r31Var.H);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        x xVar = new x(i7, context, f6Var);
        xVar.setBackground(new y1(k6.w0(k6.f27848d6, f6Var)));
        return xVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
