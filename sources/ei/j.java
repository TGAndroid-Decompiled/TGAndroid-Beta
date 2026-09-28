package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class j extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(int i10, String str, String str2) {
        x51 J = x51.J(j.class);
        J.f30292k = i10;
        J.f30293l = str;
        J.f30294m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((k) view).a(x51Var.f30293l, x51Var.f30294m, x51Var.f30292k);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
