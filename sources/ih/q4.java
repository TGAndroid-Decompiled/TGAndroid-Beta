package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class q4 extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(String str) {
        w41 J = w41.J(q4.class);
        J.f34300l = str;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((r4) view).set(w41Var.f34300l);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new r4(context, c6Var);
    }
}
