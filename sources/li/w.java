package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class w extends v31 {
    public static final int f18946b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ((x) view).h((a) w31Var.G, (n3) w31Var.H);
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
