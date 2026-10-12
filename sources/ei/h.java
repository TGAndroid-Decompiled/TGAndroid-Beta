package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class h extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        u61 J = u61.J(h.class);
        J.d = i10;
        J.f31084z = i11;
        J.f31070k = i12;
        J.f31071l = charSequence;
        J.f31072m = str;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        ((i) view).a(u61Var.f31084z, u61Var.f31070k, u61Var.f31071l, u61Var.f31072m);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }
}
