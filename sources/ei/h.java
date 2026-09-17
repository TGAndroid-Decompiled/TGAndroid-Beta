package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class h extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        j51 J = j51.J(h.class);
        J.d = i10;
        J.f25137z = i11;
        J.f25123k = i12;
        J.f25124l = charSequence;
        J.f25125m = str;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        ((i) view).a(j51Var.f25137z, j51Var.f25123k, j51Var.f25124l, j51Var.f25125m);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var);
    }
}
