package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class h extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        y51 J = y51.J(h.class);
        J.d = i10;
        J.f30531z = i11;
        J.f30517k = i12;
        J.f30518l = charSequence;
        J.f30519m = str;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((i) view).a(y51Var.f30531z, y51Var.f30517k, y51Var.f30518l, y51Var.f30519m);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var);
    }
}
