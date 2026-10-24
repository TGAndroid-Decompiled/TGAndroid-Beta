package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class h extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        l61 J = l61.J(h.class);
        J.d = i10;
        J.f28240z = i11;
        J.f28226k = i12;
        J.f28227l = charSequence;
        J.f28228m = str;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((i) view).a(l61Var.f28240z, l61Var.f28226k, l61Var.f28227l, l61Var.f28228m);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new i(context, g6Var);
    }
}
