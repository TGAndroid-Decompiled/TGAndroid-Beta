package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class h extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        y51 J = y51.J(h.class);
        J.d = i10;
        J.f30650z = i11;
        J.f30636k = i12;
        J.f30637l = charSequence;
        J.f30638m = str;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((i) view).a(y51Var.f30650z, y51Var.f30636k, y51Var.f30637l, y51Var.f30638m);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
