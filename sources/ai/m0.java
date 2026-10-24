package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class m0 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(String str, CharSequence charSequence, int i10) {
        l61 J = l61.J(m0.class);
        J.f44713b = false;
        J.f28240z = i10;
        J.f28227l = str;
        J.f28228m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((n0) view).a(l61Var.f28227l, l61Var.f28228m, l61Var.f28240z);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new n0(context, 0, g6Var);
    }
}
