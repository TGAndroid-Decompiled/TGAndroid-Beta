package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class h extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        x51 J = x51.J(h.class);
        J.d = i10;
        J.f30261z = i11;
        J.f30247k = i12;
        J.f30248l = charSequence;
        J.f30249m = str;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((i) view).a(x51Var.f30261z, x51Var.f30247k, x51Var.f30248l, x51Var.f30249m);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        return new i(context, e6Var);
    }
}
