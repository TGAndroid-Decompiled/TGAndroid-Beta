package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class m0 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(String str, CharSequence charSequence, int i10) {
        m61 J = m61.J(m0.class);
        J.f44714b = false;
        J.f28572z = i10;
        J.f28559l = str;
        J.f28560m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((n0) view).a(m61Var.f28559l, m61Var.f28560m, m61Var.f28572z);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new n0(context, 0, g6Var);
    }
}
